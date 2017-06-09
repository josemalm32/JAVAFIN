package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Articulo;
import Vista.NuevoArticuloUI;
import control.logica.GestorCRUD;
import utiles.Tipo;

@SuppressWarnings("serial")
public class controlNuevoArticuloUI extends NuevoArticuloUI implements IControlAltas{

	GestorCRUD gestorCRUDArticulos = new GestorCRUD(Tipo.articulo);
	
	public controlNuevoArticuloUI() {
		super();
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			guardar();
			}
		});
		
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				desbloqueaUI();
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				int respuesta = JOptionPane.showConfirmDialog(null, "Va cancelar el Articulo, ¿esta seguro?", "AVISO!!!!!", JOptionPane.YES_NO_OPTION);
		        if (respuesta == JOptionPane.YES_OPTION) {
		        	limpiaUI();
		        }
			}
		});
		
	}
	
	@Override
	public boolean esNumerico(String str)
	  {
	    try
	    {
	      double d = Double.parseDouble(str);
	    }
	    catch(NumberFormatException nfe)
	    {
	      return false;
	    }
	    return true;
	  }
	
	@Override
	public void desbloqueaUI() {
		nombreText.setEnabled(true);
		PrecioText.setEnabled(true);
		DetallePane.setEnabled(true);
		btnCancelar.setEnabled(true);
		btnGuardar.setEnabled(true);
		btnNuevo.setEnabled(false);
		idTexField.setText(String.valueOf(gestorCRUDArticulos.devuelveID()));
	}
	
	@Override
	public void limpiaUI() {
		nombreText.setText("");
		nombreText.setEnabled(false);
		PrecioText.setEnabled(false);
		PrecioText.setText("");
		DetallePane.setEnabled(false);
		DetallePane.setText("");
		idTexField.setText("");
		btnCancelar.setEnabled(false);
		btnGuardar.setEnabled(false);
		btnNuevo.setEnabled(true);
	}
	
	@Override
	public void guardar(){
		if(PrecioText.getText().length() >= 1 && esNumerico(PrecioText.getText())){
			if(DetallePane.getText().length() >= 1){
			
				Articulo articuloTemp = new Articulo(Integer.valueOf(idTexField.getText()), nombreText.getText(), DetallePane.getText(),Float.valueOf(PrecioText.getText()));
				if (gestorCRUDArticulos.escribeLista(articuloTemp)){
					limpiaUI();
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
	
	

}
