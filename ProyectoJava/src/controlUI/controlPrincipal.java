package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Vista.NuevoArticuloUI;
import Vista.PrincipalUI;
import Vista.VerArticulosUI;

public class controlPrincipal extends PrincipalUI {
	
	public controlPrincipal(){
		super();
		
		
		mntmAadirArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlNuevoArticuloUI nuevoArticuloUI = new controlNuevoArticuloUI();
				nuevoArticuloUI.setResizable(true);
				nuevoArticuloUI.setClosable(true);
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
				 desktopPane.add(verArticulosUI);
				 verArticulosUI.setVisible(true);
			}
		});
		
		mntmAadirClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlNuevoClienteUI nuevoClienteUI = new controlNuevoClienteUI();
				nuevoClienteUI.setResizable(true);
				nuevoClienteUI.setClosable(true);
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
				nuevoPedido.pack();
				 desktopPane.add(nuevoPedido);
				 nuevoPedido.setVisible(true);
			}
		});
		
		mntmConsultarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlVerPedido verPedido = new controlVerPedido();
				verPedido.setResizable(true);
				verPedido.setClosable(true);
				verPedido.pack();
				 desktopPane.add(verPedido);
				 verPedido.setVisible(true);
			}
		});
		
	}
	
	



}
