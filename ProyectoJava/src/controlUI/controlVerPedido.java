package controlUI;

import javax.swing.DefaultComboBoxModel;

import Modelo.Articulo;
import Modelo.Pedido;
import Vista.ConsultaPedido;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class controlVerPedido extends ConsultaPedido {
	
	GestorCRUD gestorPedidos = new GestorCRUD(Tipo.pedido);
	
	public controlVerPedido() {
		super();
		cargaCombo();
		
		
		
		
		
	}
	
	private void cargaCombo(){
		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Pedido item : gestorPedidos.getListaPedido()) {
			comboBox.addItem(item.getID() + " - " +item.getCliente().getNombre());
		}
		
		
	}
	

}
