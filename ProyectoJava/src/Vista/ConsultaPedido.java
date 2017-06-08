package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class ConsultaPedido extends JInternalFrame {
	protected JTable table;
	protected JComboBox<String> comboBox;
	protected JTextField direcion;
	protected JTextField nombre;
	protected JTextField apellido;
	protected JTextField dni;
	protected JTextField id;
	protected JTextField Fecha;
	
		public ConsultaPedido() {
		setBounds(100, 100, 1014, 524);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 236, 0, 103, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 67, 52, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36, 27, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_1 = new JLabel("Consulta PEDIDO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 34));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.gridwidth = 15;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Pedido");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		comboBox = new JComboBox();
	
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 2;
		getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 26));
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.gridwidth = 5;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 2;
		gbc_lblCliente.gridy = 3;
		getContentPane().add(lblCliente, gbc_lblCliente);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 4;
		getContentPane().add(lblNombre, gbc_lblNombre);
		
		nombre = new JTextField("");
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombre.gridwidth = 4;
		gbc_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_nombre.gridx = 2;
		gbc_nombre.gridy = 4;
		getContentPane().add(nombre, gbc_nombre);
		
		JLabel lblDni = new JLabel("DNI:");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.gridwidth = 2;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 6;
		gbc_lblDni.gridy = 4;
		getContentPane().add(lblDni, gbc_lblDni);
		
		dni = new JTextField("");
		GridBagConstraints gbc_dni = new GridBagConstraints();
		gbc_dni.fill = GridBagConstraints.HORIZONTAL;
		gbc_dni.gridwidth = 6;
		gbc_dni.insets = new Insets(0, 0, 5, 5);
		gbc_dni.gridx = 8;
		gbc_dni.gridy = 4;
		getContentPane().add(dni, gbc_dni);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.EAST;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 1;
		gbc_lblApellido.gridy = 5;
		getContentPane().add(lblApellido, gbc_lblApellido);
		
		apellido = new JTextField("");
		GridBagConstraints gbc_apellido = new GridBagConstraints();
		gbc_apellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellido.gridwidth = 4;
		gbc_apellido.insets = new Insets(0, 0, 5, 5);
		gbc_apellido.gridx = 2;
		gbc_apellido.gridy = 5;
		getContentPane().add(apellido, gbc_apellido);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 6;
		getContentPane().add(lblDireccion, gbc_lblDireccion);
		
		direcion = new JTextField("");
		GridBagConstraints gbc_direcion = new GridBagConstraints();
		gbc_direcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_direcion.gridwidth = 4;
		gbc_direcion.insets = new Insets(0, 0, 5, 5);
		gbc_direcion.gridx = 2;
		gbc_direcion.gridy = 6;
		getContentPane().add(direcion, gbc_direcion);
		
		JLabel lblDatosPedido = new JLabel("Datos Pedido");
		lblDatosPedido.setFont(new Font("Tahoma", Font.BOLD, 26));
		GridBagConstraints gbc_lblDatosPedido = new GridBagConstraints();
		gbc_lblDatosPedido.gridwidth = 5;
		gbc_lblDatosPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosPedido.gridx = 2;
		gbc_lblDatosPedido.gridy = 7;
		getContentPane().add(lblDatosPedido, gbc_lblDatosPedido);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 8;
		getContentPane().add(lblId, gbc_lblId);
		
		id = new JTextField("");
		GridBagConstraints gbc_id = new GridBagConstraints();
		gbc_id.gridwidth = 2;
		gbc_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_id.insets = new Insets(0, 0, 5, 5);
		gbc_id.gridx = 2;
		gbc_id.gridy = 8;
		getContentPane().add(id, gbc_id);
		
		JLabel lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 9;
		getContentPane().add(lblFecha, gbc_lblFecha);
		
		Fecha = new JTextField("");
		GridBagConstraints gbc_Fecha = new GridBagConstraints();
		gbc_Fecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_Fecha.gridwidth = 4;
		gbc_Fecha.insets = new Insets(0, 0, 5, 5);
		gbc_Fecha.gridx = 2;
		gbc_Fecha.gridy = 9;
		getContentPane().add(Fecha, gbc_Fecha);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.anchor = GridBagConstraints.NORTH;
		gbc_scrollPane.gridwidth = 15;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.HORIZONTAL;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 11;
		getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Linea", "Articulo", "Cantidad", "Precio", "Subtotal"
				}
			));
		scrollPane.setViewportView(table);
	
	}
	


}
