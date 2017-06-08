package Vista;


import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VerClienteUI extends JInternalFrame {
	protected JTextField NombreText;
	protected JTextField ApellidosText;
	protected JTextField DireccionText;
	protected JComboBox comboBox;
	public VerClienteUI() {
		setBounds(100, 100, 747, 454);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, -2, 66, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblConsultaCliente = new JLabel("Consulta Cliente");
		lblConsultaCliente.setFont(new Font("Tahoma", Font.PLAIN, 42));
		GridBagConstraints gbc_lblConsultaCliente = new GridBagConstraints();
		gbc_lblConsultaCliente.gridwidth = 3;
		gbc_lblConsultaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultaCliente.gridx = 2;
		gbc_lblConsultaCliente.gridy = 2;
		getContentPane().add(lblConsultaCliente, gbc_lblConsultaCliente);
		
		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.EAST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 5;
		getContentPane().add(lblDni, gbc_lblDni);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 5;
		getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 7;
		getContentPane().add(lblNombre, gbc_lblNombre);
		
		NombreText = new JTextField();
		NombreText.setEditable(false);
		GridBagConstraints gbc_NombreText = new GridBagConstraints();
		gbc_NombreText.gridwidth = 3;
		gbc_NombreText.insets = new Insets(0, 0, 5, 5);
		gbc_NombreText.fill = GridBagConstraints.HORIZONTAL;
		gbc_NombreText.gridx = 2;
		gbc_NombreText.gridy = 7;
		getContentPane().add(NombreText, gbc_NombreText);
		NombreText.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 9;
		getContentPane().add(lblApellidos, gbc_lblApellidos);
		
		ApellidosText = new JTextField();
		ApellidosText.setEditable(false);
		GridBagConstraints gbc_ApellidosText = new GridBagConstraints();
		gbc_ApellidosText.gridwidth = 3;
		gbc_ApellidosText.insets = new Insets(0, 0, 5, 5);
		gbc_ApellidosText.fill = GridBagConstraints.HORIZONTAL;
		gbc_ApellidosText.gridx = 2;
		gbc_ApellidosText.gridy = 9;
		getContentPane().add(ApellidosText, gbc_ApellidosText);
		ApellidosText.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 0, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 11;
		getContentPane().add(lblDireccion, gbc_lblDireccion);
		
		DireccionText = new JTextField();
		DireccionText.setEditable(false);
		GridBagConstraints gbc_DireccionText = new GridBagConstraints();
		gbc_DireccionText.gridwidth = 3;
		gbc_DireccionText.insets = new Insets(0, 0, 0, 5);
		gbc_DireccionText.fill = GridBagConstraints.HORIZONTAL;
		gbc_DireccionText.gridx = 2;
		gbc_DireccionText.gridy = 11;
		getContentPane().add(DireccionText, gbc_DireccionText);
		DireccionText.setColumns(10);

	}

}
