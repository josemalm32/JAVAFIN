package Vista;


import javax.swing.JInternalFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;
import java.awt.Font;




import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class VerArticulosUI extends JInternalFrame {
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JLabel lblNewLabel_2;
	private JLabel lblDetalles;
	protected JComboBox<String> comboBox;
	protected JTextArea txtrS;
	
	public VerArticulosUI() {
		setBounds(100, 100, 759, 428);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{76, 534, 97, 0};
		gridBagLayout.rowHeights = new int[]{39, 20, 20, 20, 36, 14, 199, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel_2 = new JLabel("Consulta Articulos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("ID");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		getContentPane().add(textField, gbc_textField);
		
		comboBox = new JComboBox();
		
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.insets = new Insets(0, 0, 5, 0);
				gbc_comboBox.gridx = 2;
				gbc_comboBox.gridy = 1;
				getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Articulo");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		getContentPane().add(textField_1, gbc_textField_1);
		
		JLabel lblPrecioud = new JLabel("Precio/UD");
		GridBagConstraints gbc_lblPrecioud = new GridBagConstraints();
		gbc_lblPrecioud.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioud.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioud.gridx = 0;
		gbc_lblPrecioud.gridy = 3;
		getContentPane().add(lblPrecioud, gbc_lblPrecioud);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		getContentPane().add(textField_2, gbc_textField_2);
		
		lblDetalles = new JLabel("Detalles");
		GridBagConstraints gbc_lblDetalles = new GridBagConstraints();
		gbc_lblDetalles.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDetalles.insets = new Insets(0, 0, 0, 5);
		gbc_lblDetalles.gridx = 0;
		gbc_lblDetalles.gridy = 6;
		getContentPane().add(lblDetalles, gbc_lblDetalles);
		
		txtrS = new JTextArea();
		txtrS.setEditable(false);
		GridBagConstraints gbc_txtrS = new GridBagConstraints();
		gbc_txtrS.fill = GridBagConstraints.BOTH;
		gbc_txtrS.insets = new Insets(0, 0, 0, 5);
		gbc_txtrS.gridx = 1;
		gbc_txtrS.gridy = 6;
		getContentPane().add(txtrS, gbc_txtrS);

	}
}
