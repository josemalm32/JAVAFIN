package Vista;



import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class NuevoClienteUI extends JInternalFrame {
	protected JTextField dniText;
	protected JTextField nombreText;
	protected JTextField apellidoText;
	protected JTextField direccionText;
	private JMenuBar menuBar;
	protected JButton nuevo;
	protected JButton btnValidar;
	protected JButton cancelar;

	public NuevoClienteUI() {
		setBounds(100, 100, 914, 500);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblAltaCliente = new JLabel("Alta Cliente");
		lblAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 46));
		GridBagConstraints gbc_lblAltaCliente = new GridBagConstraints();
		gbc_lblAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaCliente.gridx = 6;
		gbc_lblAltaCliente.gridy = 1;
		getContentPane().add(lblAltaCliente, gbc_lblAltaCliente);
		
		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 4;
		gbc_lblDni.gridy = 3;
		getContentPane().add(lblDni, gbc_lblDni);
		
		dniText = new JTextField();
		dniText.setEnabled(false);
		GridBagConstraints gbc_dniText = new GridBagConstraints();
		gbc_dniText.insets = new Insets(0, 0, 5, 5);
		gbc_dniText.fill = GridBagConstraints.HORIZONTAL;
		gbc_dniText.gridx = 6;
		gbc_dniText.gridy = 3;
		getContentPane().add(dniText, gbc_dniText);
		dniText.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 4;
		gbc_lblNombre.gridy = 5;
		getContentPane().add(lblNombre, gbc_lblNombre);
		
		nombreText = new JTextField();
		nombreText.setEnabled(false);
		GridBagConstraints gbc_nombreText = new GridBagConstraints();
		gbc_nombreText.insets = new Insets(0, 0, 5, 5);
		gbc_nombreText.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreText.gridx = 6;
		gbc_nombreText.gridy = 5;
		getContentPane().add(nombreText, gbc_nombreText);
		nombreText.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 4;
		gbc_lblApellido.gridy = 7;
		getContentPane().add(lblApellido, gbc_lblApellido);
		
		apellidoText = new JTextField();
		apellidoText.setEnabled(false);
		GridBagConstraints gbc_apellidoText = new GridBagConstraints();
		gbc_apellidoText.insets = new Insets(0, 0, 5, 5);
		gbc_apellidoText.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellidoText.gridx = 6;
		gbc_apellidoText.gridy = 7;
		getContentPane().add(apellidoText, gbc_apellidoText);
		apellidoText.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 4;
		gbc_lblDireccion.gridy = 9;
		getContentPane().add(lblDireccion, gbc_lblDireccion);
		
		direccionText = new JTextField();
		direccionText.setEnabled(false);
		GridBagConstraints gbc_direccionText = new GridBagConstraints();
		gbc_direccionText.insets = new Insets(0, 0, 5, 5);
		gbc_direccionText.fill = GridBagConstraints.HORIZONTAL;
		gbc_direccionText.gridx = 6;
		gbc_direccionText.gridy = 9;
		getContentPane().add(direccionText, gbc_direccionText);
		direccionText.setColumns(10);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		nuevo = new JButton("Nuevo");
		nuevo.setHorizontalAlignment(SwingConstants.TRAILING);
		nuevo.setIcon(new ImageIcon(NuevoClienteUI.class.getResource("/recursos/Knob Add.png")));
		menuBar.add(nuevo);
		
		btnValidar = new JButton("Validar");
		btnValidar.setEnabled(false);
		btnValidar.setIcon(new ImageIcon(NuevoClienteUI.class.getResource("/recursos/Knob Valid Green.png")));
		menuBar.add(btnValidar);
		
		cancelar = new JButton("Cancelar");
		cancelar.setEnabled(false);
		cancelar.setIcon(new ImageIcon(NuevoClienteUI.class.getResource("/recursos/Knob Cancel.png")));
		menuBar.add(cancelar);

	}

}
