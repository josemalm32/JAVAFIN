package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Persona;
import Vista.NuevoClienteUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class controlNuevoClienteUI extends NuevoClienteUI implements IControlAltas {

	private GestorCRUD gestorCRUD = new GestorCRUD(Tipo.cliente);
	private boolean anadido = false;

	public controlNuevoClienteUI() {
		super();
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar();
			}
		});

		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desbloqueaUI();
			}
		});

		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int respuesta = JOptionPane.showConfirmDialog(null, "Va cancelar el cliente, ¿esta seguro?",
						"AVISO!!!!!", JOptionPane.YES_NO_OPTION);
				if (respuesta == JOptionPane.YES_OPTION) {
					limpiaUI();
				}

			}
		});

	}

	@Override
	public void guardar() {
		if (dniText.getText().length() > 5) {
			if (gestorCRUD.compruebaDNI(dniText.getText().trim())) {
				if (nombreText.getText().length() >= 3) {
					if (apellidoText.getText().length() >= 3) {
						if (apellidoText.getText().length() >= 3) {
							Persona personaTemp = new Persona(dniText.getText(), nombreText.getText(),
									apellidoText.getText(), direccionText.getText());
							if (gestorCRUD.escribeLista(personaTemp)) {
								JOptionPane.showMessageDialog(null, "Cliente añadido correctamente :)");
								limpiaUI();
								anadido = true;
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
				JOptionPane.showMessageDialog(null, "Error: DNI ya existente...");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error: Introduce el DNI correctamente");
		}
	}

	@Override
	public void limpiaUI() {
		apellidoText.setText("");
		apellidoText.setEnabled(false);
		nombreText.setText("");
		nombreText.setEnabled(false);
		direccionText.setEnabled(false);
		dniText.setText("");
		direccionText.setText("");
		dniText.setEnabled(false);
		nuevo.setEnabled(true);
		btnValidar.setEnabled(false);
		cancelar.setEnabled(false);

	}

	@Override
	public void desbloqueaUI() {
		nuevo.setEnabled(false);
		btnValidar.setEnabled(true);
		cancelar.setEnabled(true);
		dniText.setEnabled(true);
		nombreText.setEnabled(true);
		apellidoText.setEnabled(true);
		direccionText.setEnabled(true);
		anadido = false;

	}

	@Override
	public boolean esNumerico(String str) {

		return false;
	}

}
