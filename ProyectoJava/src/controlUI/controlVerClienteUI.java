package controlUI;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;

import Modelo.Persona;
import Vista.VerClienteUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class controlVerClienteUI extends VerClienteUI{

	public controlVerClienteUI() {
		super();
		GestorCRUD gestorCRUD = new GestorCRUD(Tipo.cliente);
		
		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Persona item : gestorCRUD.getListaPersona()) {
			comboBox.addItem(item.getDNI() + " - " +item.getNombre() + " " + item.getApellido());
		}
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			Persona persona = gestorCRUD.getListaPersona().get(comboBox.getSelectedIndex());
			
			NombreText.setText(persona.getNombre());
			ApellidosText.setText(persona.getApellido());
			DireccionText.setText(persona.getDireccion());	
			}
		});
		
		
		
		
		
	}
		
}
