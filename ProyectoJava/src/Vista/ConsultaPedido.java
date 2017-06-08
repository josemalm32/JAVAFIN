package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;

public class ConsultaPedido extends JInternalFrame {
	protected JComboBox<String> comboBox;
	
	public ConsultaPedido() {
		setBounds(100, 100, 815, 582);
		getContentPane().setLayout(null);
		
		 comboBox = new JComboBox<String>();
		comboBox.setBounds(202, 236, 250, 20);
		getContentPane().add(comboBox);

	}
}
