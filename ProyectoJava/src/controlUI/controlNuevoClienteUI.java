package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Persona;
import Vista.NuevoClienteUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class controlNuevoClienteUI extends NuevoClienteUI {

	GestorCRUD gestorCRUD = new GestorCRUD(Tipo.cliente);

	public controlNuevoClienteUI() {
		super();
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dniText.getText().length() >= 6) {
					if (nombreText.getText().length() >= 3) {
						if (apellidoText.getText().length() >= 3) {
							if (apellidoText.getText().length() >= 3) {
								Persona personaTemp = new Persona(dniText.getText(), nombreText.getText(),
										apellidoText.getText(), direccionText.getText());
								if (gestorCRUD.escribeLista(personaTemp)) {
									JOptionPane.showMessageDialog(null, "Cliente añadido correctamente :)");

								} else {
									JOptionPane.showMessageDialog(null, "Error: Problemas al crear el cliente");
								}
							} else {
								JOptionPane.showMessageDialog(null, "Error: Introduce correctamente la Direccion");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Error: Introduce correctamente el Apellido");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Error: Introduce correctamente el Nombre");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Error: Introduce correctamente el DNI");
				}
			}
		});

	}

}
