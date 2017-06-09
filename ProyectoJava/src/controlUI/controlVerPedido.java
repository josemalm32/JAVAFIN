package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import Modelo.Lineas;
import Modelo.Pedido;
import Vista.ConsultaPedido;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class controlVerPedido extends ConsultaPedido implements IConsulta {

	GestorCRUD gestorPedidos = new GestorCRUD(Tipo.pedido);
	private Float totalPrecio = 0f;
	public controlVerPedido() {
		super();
		llenaCombo();

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				Pedido pedidoTemp = gestorPedidos.getListaPedido().get(comboBox.getSelectedIndex());
				// Datos Pedido
				id.setText(String.valueOf(pedidoTemp.getID()));
				Fecha.setText(pedidoTemp.getFecha().toString());
				// Datos cliente
				nombre.setText(pedidoTemp.getCliente().getNombre());
				apellido.setText(pedidoTemp.getCliente().getApellido());
				dni.setText(pedidoTemp.getCliente().getDNI());
				direcion.setText(pedidoTemp.getCliente().getDireccion());
				modelo.setRowCount(0);
				totalPrecio = 0f;
				for (Lineas item : gestorPedidos.getListaPedido().get(comboBox.getSelectedIndex()).getListaLineas()) {
					Object[] rowData = { item.getNumeroLinea(), item.getArticulo().getNombre(), item.getCantidad(),
							item.getArticulo().getPrecio(), (item.getArticulo().getPrecio() * item.getCantidad()) };
					modelo.addRow(rowData);
					totalPrecio = totalPrecio + (item.getArticulo().getPrecio() * item.getCantidad());
					total.setText(String.valueOf(totalPrecio));
				}

			}
		});

	}

	@Override
	public void llenaCombo() {
		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Pedido item : gestorPedidos.getListaPedido()) {
			comboBox.addItem(item.getID() + " - " + item.getCliente().getNombre());
		}
	}

}
