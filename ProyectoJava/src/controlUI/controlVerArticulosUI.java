package controlUI;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;

import Modelo.Articulo;
import Vista.VerArticulosUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

@SuppressWarnings("serial")
public class controlVerArticulosUI extends VerArticulosUI{	
	
	
	
	public controlVerArticulosUI() {
		super();
		GestorCRUD gestorCRUDArticulos = new GestorCRUD(Tipo.articulo);
		
		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Articulo item : gestorCRUDArticulos.getListaArticulo()) {
			comboBox.addItem(item.getID() + " - " +item.getNombre() + " - " + item.getPrecio());
		}
		
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
			Articulo articulo = gestorCRUDArticulos.getListaArticulo().get(comboBox.getSelectedIndex());

			textField.setText(String.valueOf(articulo.getID()));
			textField_1.setText(articulo.getNombre());
			textField_2.setText(String.valueOf(articulo.getPrecio()));	
			txtrS.setText(articulo.getDetalles());
			}
		});
		
		
	}

	
	
	
	
	
	
	
}
