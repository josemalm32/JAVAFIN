package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Vista.PrincipalUI;


public class controlPrincipal extends PrincipalUI {
	
	public controlPrincipal(){
		super();
		
		
		mntmAadirArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlNuevoArticuloUI nuevoArticuloUI = new controlNuevoArticuloUI();
				nuevoArticuloUI.setResizable(true);
				nuevoArticuloUI.setClosable(true);
				nuevoArticuloUI.setMaximizable(true);
				 nuevoArticuloUI.pack();
				 desktopPane.add(nuevoArticuloUI);
				 nuevoArticuloUI.setVisible(true);
			}
		});
		
		
		mntmConsultarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlVerArticulosUI verArticulosUI = new controlVerArticulosUI();
				verArticulosUI.setResizable(true);
				verArticulosUI.setClosable(true);
				verArticulosUI.pack();
				verArticulosUI.setMaximizable(true);
				 desktopPane.add(verArticulosUI);
				 verArticulosUI.setVisible(true);
			}
		});
		
		mntmAadirClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlNuevoClienteUI nuevoClienteUI = new controlNuevoClienteUI();
				nuevoClienteUI.setResizable(true);
				nuevoClienteUI.setClosable(true);
				nuevoClienteUI.setMaximizable(true);
				nuevoClienteUI.pack();
				 desktopPane.add(nuevoClienteUI);
				 nuevoClienteUI.setVisible(true);
			}
		});
		
		
		mntmConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlVerClienteUI controlVerClienteUI = new controlVerClienteUI();
				controlVerClienteUI.setResizable(true);
				controlVerClienteUI.setClosable(true);
				controlVerClienteUI.setMaximizable(true);
				controlVerClienteUI.pack();
				 desktopPane.add(controlVerClienteUI);
				 controlVerClienteUI.setVisible(true);
			}
		});
		
		
		mntmNuevoPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlNuevoPedidoUI nuevoPedido = new controlNuevoPedidoUI();
				nuevoPedido.setResizable(true);
				nuevoPedido.setClosable(true);
				nuevoPedido.setMaximizable(true);
				nuevoPedido.pack();
				 desktopPane.add(nuevoPedido);
				 nuevoPedido.setVisible(true);
				 try {
					 nuevoPedido.setMaximum(true);
					} catch (PropertyVetoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		
		mntmConsultarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlVerPedido verPedido = new controlVerPedido();
				verPedido.setResizable(true);
				verPedido.setMaximizable(true);
			
				verPedido.setClosable(true);
				verPedido.pack();
				 desktopPane.add(verPedido);
				 verPedido.setVisible(true);
				 try {
					verPedido.setMaximum(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int respuesta = JOptionPane.showConfirmDialog(null, "Va a cerrar el programa, ¿esta seguro?", "AVISO!!!!!", JOptionPane.YES_NO_OPTION);
		        if (respuesta == JOptionPane.YES_OPTION) {
		        	JOptionPane.showMessageDialog(null, "JMASTUDIO Recomienda hacer copias de seguridad periodicamente");
		          System.exit(0);
		        }
			}
		});
		
	}
	
	



}
