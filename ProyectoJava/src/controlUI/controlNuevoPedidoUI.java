package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import Modelo.Articulo;
import Modelo.DAO;
import Modelo.Lineas;
import Modelo.Pedido;
import Modelo.Persona;
import Vista.AltaPedido;
import control.logica.GestorCRUD;
import utiles.Tipo;

@SuppressWarnings("serial")
public class controlNuevoPedidoUI extends AltaPedido {

	private GestorCRUD gestorArticulos = new GestorCRUD(Tipo.articulo);
	private GestorCRUD gestorClientes = new GestorCRUD(Tipo.cliente);
	private GestorCRUD gestorPedido = new GestorCRUD(Tipo.pedido);
	private ArrayList<Lineas> lineasPedidos = new ArrayList<Lineas>();

	private int Lineas;
	
	public controlNuevoPedidoUI() {
		super();
		llenarComboBox();
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Persona persona = gestorClientes.getListaPersona().get(comboBox.getSelectedIndex());
				nombreText.setText(persona.getNombre());
				apellidoText.setText(persona.getApellido());
				direccionText.setText(persona.getDireccion());
			}
		});

		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Articulo articulo = gestorArticulos.getListaArticulo().get(comboBox_1.getSelectedIndex());
				detalleText.setText(articulo.getDetalles());
				precioText.setText(String.valueOf(articulo.getPrecio()));

			}
		});

		anadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				Object[] rowData = { Lineas, comboBox_1.getSelectedItem().toString(),Integer.valueOf(cantidadText.getText()),Float.valueOf(precioText.getText()),Integer.valueOf(cantidadText.getText())*Float.valueOf(precioText.getText()) };
				Lineas lineasTemp = new Lineas(gestorArticulos.getListaArticulo().get(comboBox_1.getSelectedIndex()), Integer.valueOf(cantidadText.getText()), Lineas);
				lineasPedidos.add(lineasTemp);
				modelo.addRow(rowData);
				Lineas++;
			}
		});
		
		
		
		quitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				modelo.removeRow(table.getSelectedRow());
				lineasPedidos.remove(table.getSelectedRow());
			}
		});
		
		validar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Pedido pedido =new Pedido(gestorClientes.getListaPersona().get(comboBox.getSelectedIndex()), lineasPedidos, new Date(), gestorPedido.dameIDPedido());
			new DAO().grabar(pedido, Tipo.pedido.getRuta(), Tipo.pedido.isLista());
			}
		});
		
		
	}

	private void llenarComboBox() {

		comboBox_1.setModel(new DefaultComboBoxModel<String>());
		for (Articulo item : gestorArticulos.getListaArticulo()) {
			comboBox_1.addItem(item.getID() + " - " + item.getNombre() + " - " + item.getPrecio());
		}

		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Persona item : gestorClientes.getListaPersona()) {
			comboBox.addItem(item.getDNI() + " - " + item.getNombre() + " " + item.getApellido());
		}

	}

}
