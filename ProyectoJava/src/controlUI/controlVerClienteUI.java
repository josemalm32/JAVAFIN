package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;

import Modelo.Persona;
import Vista.VerClienteUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class controlVerClienteUI extends VerClienteUI implements IConsulta{
	GestorCRUD gestorCRUD = new GestorCRUD(Tipo.cliente);
	
	public controlVerClienteUI() {
		super();		
		llenaCombo();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Persona persona = gestorCRUD.getListaPersona().get(comboBox.getSelectedIndex());
			
			NombreText.setText(persona.getNombre());
			ApellidosText.setText(persona.getApellido());
			DireccionText.setText(persona.getDireccion());	
			}
		});
		
		
		
		
		
	}

	@Override
	public void llenaCombo() {
			comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Persona item : gestorCRUD.getListaPersona()) {
			comboBox.addItem(item.getDNI() + " - " +item.getNombre() + " " + item.getApellido());
		}
	}
		
}
