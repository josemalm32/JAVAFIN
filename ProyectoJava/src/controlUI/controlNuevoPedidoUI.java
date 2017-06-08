package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Persona persona = gestorClientes.getListaPersona().get(comboBox.getSelectedIndex());
				nombreText.setText(persona.getNombre());
				apellidoText.setText(persona.getApellido());
				direccionText.setText(persona.getDireccion());
			}
		});

		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Articulo articulo = gestorArticulos.getListaArticulo().get(comboBox_1.getSelectedIndex());
				detalleText.setText(articulo.getDetalles());
				precioText.setText(String.valueOf(articulo.getPrecio()));

			}
		});

		anadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!precioText.getText().isEmpty()) {

					if (!cantidadText.getText().isEmpty()) {
						DefaultTableModel modelo = (DefaultTableModel) table.getModel();
						Object[] rowData = { Lineas, comboBox_1.getSelectedItem().toString(),
								Integer.valueOf(cantidadText.getText()), Float.valueOf(precioText.getText()),
								Integer.valueOf(cantidadText.getText()) * Float.valueOf(precioText.getText()) };
						Lineas lineasTemp = new Lineas(
								gestorArticulos.getListaArticulo().get(comboBox_1.getSelectedIndex()),
								Integer.valueOf(cantidadText.getText()), Lineas);
						lineasPedidos.add(lineasTemp);
						modelo.addRow(rowData);
						Lineas++;
					} else {
						JOptionPane.showMessageDialog(null, "No hay cantidad selecionada");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Ningun articulo selecionado");
				}

			}
		});

		quitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				modelo.removeRow(table.getSelectedRow());
				lineasPedidos.remove(table.getSelectedRow());
			}
		});

		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desbloqueaUI();
			}
		});

		validar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar();
			}
		});
		
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int respuesta = JOptionPane.showConfirmDialog(null, "Va cancelar el Pedido, ¿esta seguro?", "AVISO!!!!!", JOptionPane.YES_NO_OPTION);
		        if (respuesta == JOptionPane.YES_OPTION) {
		        	limpiaUI();
		        }
				
			}
		});

	}
	
	
	
	private void desbloqueaUI() {
		comboBox.setEnabled(true);
		comboBox_1.setEnabled(true);
		table.setEnabled(true);
		cantidadText.setEnabled(true);
		nuevo.setEnabled(false);
		cancelar.setEnabled(true);
		validar.setEnabled(true);
		anadir.setEnabled(true);
		quitar.setEnabled(true);
	}

	private void guardar() {
		if (!nombreText.getText().isEmpty()) {
			if (!lineasPedidos.isEmpty()) {
				Pedido pedido = new Pedido(gestorClientes.getListaPersona().get(comboBox.getSelectedIndex()),
						lineasPedidos, new Date(), gestorPedido.dameIDPedido());
				new DAO().grabar(pedido, Tipo.pedido.getRuta(), Tipo.pedido.isLista());
				limpiaUI();
				JOptionPane.showMessageDialog(null, "Pedido añadido correctamente :)");
			} else {
				JOptionPane.showMessageDialog(null, "No hay ninguna linea Agregada..");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Cliente no selecionado");
		}
	}

	private void limpiaUI() {
		nombreText.setText("");
		apellidoText.setText("");
		direccionText.setText("");
		precioText.setText("");
		cantidadText.setText("");
		detalleText.setText("");
		cantidadText.setEnabled(false);
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		modelo.setRowCount(0);
		lineasPedidos = null;
		lineasPedidos = new ArrayList<Lineas>();
		comboBox.setEnabled(false);
		comboBox_1.setEnabled(false);
		table.setEnabled(false);
		anadir.setEnabled(false);
		quitar.setEnabled(false);
		nuevo.setEnabled(true);
		cancelar.setEnabled(false);
		validar.setEnabled(false);

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
