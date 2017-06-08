package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import Modelo.Articulo;
import Modelo.Lineas;
import Modelo.Pedido;
import Vista.ConsultaPedido;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class controlVerPedido extends ConsultaPedido {
	
	GestorCRUD gestorPedidos = new GestorCRUD(Tipo.pedido);
	
	public controlVerPedido() {
		super();
		cargaCombo();
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				Pedido pedidoTemp = gestorPedidos.getListaPedido().get(comboBox.getSelectedIndex());
				//Datos Pedido
				id.setText(String.valueOf(pedidoTemp.getID()));
				Fecha.setText(pedidoTemp.getFecha().toString());
				//Datos cliente
				nombre.setText(pedidoTemp.getCliente().getNombre());
				apellido.setText(pedidoTemp.getCliente().getApellido());
				dni.setText(pedidoTemp.getCliente().getDNI());
				direcion.setText(pedidoTemp.getCliente().getDireccion());
				modelo.setRowCount(0);
				
				for (Lineas item : gestorPedidos.getListaPedido().get(comboBox.getSelectedIndex()).getListaLineas()) {
					Object[] rowData = { item.getNumeroLinea(),item.getArticulo().getNombre(),item.getCantidad(),item.getArticulo().getPrecio(),(item.getArticulo().getPrecio() * item.getCantidad()) };
					modelo.addRow(rowData);	
				}
						
				
				
			}
		});
		
		
	}
	
	private void cargaCombo(){
		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Pedido item : gestorPedidos.getListaPedido()) {
			comboBox.addItem(item.getID() + " - " +item.getCliente().getNombre());
		}
		
		
	}
	

}
