package control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import controlUI.controlPrincipal;


public class Principal {

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					} catch (Exception e) {
						e.printStackTrace();
					}
					controlPrincipal frame = new controlPrincipal();
					  frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
	}
	
	
}
