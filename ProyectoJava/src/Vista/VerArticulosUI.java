package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Modelo.Articulo;

import javax.swing.JTextArea;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VerArticulosUI extends JInternalFrame {
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JLabel lblNewLabel_2;
	private JLabel lblDetalles;
	protected JComboBox<String> comboBox;
	protected JTextArea txtrS;
	
	public VerArticulosUI() {
		setBounds(100, 100, 778, 517);
		
		lblNewLabel_2 = new JLabel("Consulta Articulos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		getContentPane().setLayout(new MigLayout("", "[76px][558px][103px][][][][grow][][][][][][][]", "[39px][20px][20px][20px][14px][14px][23px][][][][][][][][][][]"));
		getContentPane().add(lblNewLabel_2, "cell 1 0,alignx center,aligny top");
		
		JLabel lblNewLabel = new JLabel("ID");
		getContentPane().add(lblNewLabel, "cell 0 2,alignx right,aligny center");
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		getContentPane().add(textField, "cell 1 2,growx,aligny top");
		
		comboBox = new JComboBox();

		getContentPane().add(comboBox, "cell 2 2 5 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Articulo");
		getContentPane().add(lblNewLabel_1, "cell 0 4,alignx left,aligny center");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		getContentPane().add(textField_1, "cell 1 4,growx,aligny top");
		
		JLabel lblPrecioud = new JLabel("Precio/UD");
		getContentPane().add(lblPrecioud, "cell 0 6,alignx right,aligny center");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		getContentPane().add(textField_2, "cell 1 6,growx,aligny top");
		
		lblDetalles = new JLabel("Detalles");
		getContentPane().add(lblDetalles, "cell 0 8,alignx right,aligny top");
		
		txtrS = new JTextArea();
		txtrS.setEditable(false);
		getContentPane().add(txtrS, "cell 1 9 1 7,grow");

	}
}
