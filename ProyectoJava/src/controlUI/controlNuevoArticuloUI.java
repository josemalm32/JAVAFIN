package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Articulo;
import Vista.NuevoArticuloUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

@SuppressWarnings("serial")
public class controlNuevoArticuloUI extends NuevoArticuloUI{

	GestorCRUD gestorCRUDArticulos = new GestorCRUD(Tipo.articulo);
	
	public controlNuevoArticuloUI() {
		super();
		idTexField.setText(String.valueOf(gestorCRUDArticulos.devuelveID()));
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(PrecioText.getText().length() >= 1){
					if(DetallePane.getText().length() >= 1){
					
						Articulo articuloTemp = new Articulo(Integer.valueOf(idTexField.getText()), nombreText.getText(), DetallePane.getText(),Float.valueOf(PrecioText.getText()));
						if (gestorCRUDArticulos.escribeLista(articuloTemp)){
							
							JOptionPane.showMessageDialog(null, "Articulo Introducido Correctamente :).");							
						}else{
							
							JOptionPane.showMessageDialog(null, "Error.. Articulo no introducido");
							
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Error: Introduce Descripcion.");
					}									
				}else {
					JOptionPane.showMessageDialog(null, "Error: Comprueba el Precio.");
				}		
			
				
			
			}
		});
		
	}
	
	
	

}
