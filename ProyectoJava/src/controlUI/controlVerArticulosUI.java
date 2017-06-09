package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;

import Modelo.Articulo;
import Vista.VerArticulosUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

@SuppressWarnings("serial")
public class controlVerArticulosUI extends VerArticulosUI implements IConsulta {
	GestorCRUD gestorCRUDArticulos = new GestorCRUD(Tipo.articulo);

	public controlVerArticulosUI() {
		super();
		llenaCombo();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Articulo articulo = gestorCRUDArticulos.getListaArticulo().get(comboBox.getSelectedIndex());

				textField.setText(String.valueOf(articulo.getID()));
				textField_1.setText(articulo.getNombre());
				textField_2.setText(String.valueOf(articulo.getPrecio()));
				txtrS.setText(articulo.getDetalles());
			}
		});

	}

	@Override
	public void llenaCombo() {
		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Articulo item : gestorCRUDArticulos.getListaArticulo()) {
			comboBox.addItem(item.getID() + " - " + item.getNombre() + " - " + item.getPrecio() + " €");
		}

	}

}
