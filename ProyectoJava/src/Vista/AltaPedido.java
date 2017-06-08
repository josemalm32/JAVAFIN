package Vista;

import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.Insets;


import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;

public class AltaPedido extends JInternalFrame {
	protected JTextField nombreText;
	protected JTextField apellidoText;
	protected JTextField direccionText;
	protected JTextField precioText;
	protected JTextField cantidadText;
	protected JComboBox<String> comboBox;
	protected JComboBox<String> comboBox_1;
	protected JLabel lblTotal;
	protected JButton quitar;
	protected JButton anadir;
	protected JButton validar;
	protected JButton cancelar;
	protected JButton nuevo;
	protected JTextArea detalleText;
	protected JTable table;

	public AltaPedido() {
		setBounds(100, 100, 955, 562);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 901, 0 };
		gridBagLayout.rowHeights = new int[] { 140, 140, 208, 35, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 83, 157, 66, 46, 499, 0 };
		gbl_panel.rowHeights = new int[] { 56, 25, 22, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.anchor = GridBagConstraints.NORTH;
		gbc_lblCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 0);
		gbc_lblCliente.gridwidth = 5;
		gbc_lblCliente.gridx = 0;
		gbc_lblCliente.gridy = 0;
		panel.add(lblCliente, gbc_lblCliente);

		Label label = new Label("DNI");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.SOUTHEAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);

		comboBox = new JComboBox();
		comboBox.setEnabled(false);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.SOUTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panel.add(comboBox, gbc_comboBox);

		Label label_1 = new Label("Nombre");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel.add(label_1, gbc_label_1);

		nombreText = new JTextField();
		nombreText.setEnabled(false);
		nombreText.setEditable(false);
		GridBagConstraints gbc_nombreText = new GridBagConstraints();
		gbc_nombreText.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreText.insets = new Insets(0, 0, 5, 5);
		gbc_nombreText.gridx = 1;
		gbc_nombreText.gridy = 1;
		panel.add(nombreText, gbc_nombreText);
		nombreText.setColumns(10);

		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 3;
		gbc_lblDireccion.gridy = 1;
		panel.add(lblDireccion, gbc_lblDireccion);

		direccionText = new JTextField();
		direccionText.setEnabled(false);
		direccionText.setEditable(false);
		direccionText.setColumns(10);
		GridBagConstraints gbc_direccionText = new GridBagConstraints();
		gbc_direccionText.fill = GridBagConstraints.HORIZONTAL;
		gbc_direccionText.insets = new Insets(0, 0, 5, 0);
		gbc_direccionText.gridx = 4;
		gbc_direccionText.gridy = 1;
		panel.add(direccionText, gbc_direccionText);

		Label label_2 = new Label("Apellidos");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 2;
		panel.add(label_2, gbc_label_2);

		apellidoText = new JTextField();
		apellidoText.setEnabled(false);
		apellidoText.setEditable(false);
		apellidoText.setColumns(10);
		GridBagConstraints gbc_apellidoText = new GridBagConstraints();
		gbc_apellidoText.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellidoText.insets = new Insets(0, 0, 0, 5);
		gbc_apellidoText.gridx = 1;
		gbc_apellidoText.gridy = 2;
		panel.add(apellidoText, gbc_apellidoText);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 75, 153, 188, 43, 173, 73, 0, 43, 75, 0 };
		gbl_panel_1.rowHeights = new int[] { 31, 0, 22, 23, 23, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblArticulo = new JLabel("Articulo");
		lblArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblArticulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblArticulo = new GridBagConstraints();
		gbc_lblArticulo.anchor = GridBagConstraints.NORTH;
		gbc_lblArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblArticulo.gridwidth = 9;
		gbc_lblArticulo.gridx = 0;
		gbc_lblArticulo.gridy = 0;
		panel_1.add(lblArticulo, gbc_lblArticulo);
				
						Label label_3 = new Label("Nombre");
						GridBagConstraints gbc_label_3 = new GridBagConstraints();
						gbc_label_3.anchor = GridBagConstraints.EAST;
						gbc_label_3.insets = new Insets(0, 0, 5, 5);
						gbc_label_3.gridx = 0;
						gbc_label_3.gridy = 1;
						panel_1.add(label_3, gbc_label_3);
		
				comboBox_1 = new JComboBox();
				comboBox_1.setEnabled(false);
				GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
				gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_1.gridx = 1;
				gbc_comboBox_1.gridy = 1;
				panel_1.add(comboBox_1, gbc_comboBox_1);

		JLabel lblDetalle = new JLabel("Detalle");
		GridBagConstraints gbc_lblDetalle = new GridBagConstraints();
		gbc_lblDetalle.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDetalle.insets = new Insets(0, 0, 5, 5);
		gbc_lblDetalle.gridx = 3;
		gbc_lblDetalle.gridy = 2;
		panel_1.add(lblDetalle, gbc_lblDetalle);

		detalleText = new JTextArea();
		detalleText.setEnabled(false);
		detalleText.setEditable(false);
		GridBagConstraints gbc_detalleText = new GridBagConstraints();
		gbc_detalleText.fill = GridBagConstraints.BOTH;
		gbc_detalleText.insets = new Insets(0, 0, 0, 5);
		gbc_detalleText.gridheight = 3;
		gbc_detalleText.gridx = 4;
		gbc_detalleText.gridy = 2;
		panel_1.add(detalleText, gbc_detalleText);

		Label label_4 = new Label("Precio");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 3;
		panel_1.add(label_4, gbc_label_4);

		precioText = new JTextField();
		precioText.setEnabled(false);
		precioText.setEditable(false);
		precioText.setColumns(10);
		GridBagConstraints gbc_precioText = new GridBagConstraints();
		gbc_precioText.fill = GridBagConstraints.HORIZONTAL;
		gbc_precioText.insets = new Insets(0, 0, 5, 5);
		gbc_precioText.gridx = 1;
		gbc_precioText.gridy = 3;
		panel_1.add(precioText, gbc_precioText);

		Label label_5 = new Label("Cantidad");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 4;
		panel_1.add(label_5, gbc_label_5);

		cantidadText = new JTextField();
		cantidadText.setEnabled(false);
		GridBagConstraints gbc_cantidadText = new GridBagConstraints();
		gbc_cantidadText.fill = GridBagConstraints.HORIZONTAL;
		gbc_cantidadText.insets = new Insets(0, 0, 0, 5);
		gbc_cantidadText.gridx = 1;
		gbc_cantidadText.gridy = 4;
		panel_1.add(cantidadText, gbc_cantidadText);
		cantidadText.setColumns(10);
						
								anadir = new JButton("");
								anadir.setEnabled(false);
								anadir.setIcon(new ImageIcon(AltaPedido.class.getResource("/recursos/Knob Add.png")));
								GridBagConstraints gbc_anadir = new GridBagConstraints();
								gbc_anadir.anchor = GridBagConstraints.NORTH;
								gbc_anadir.fill = GridBagConstraints.HORIZONTAL;
								gbc_anadir.insets = new Insets(0, 0, 0, 5);
								gbc_anadir.gridx = 6;
								gbc_anadir.gridy = 4;
								panel_1.add(anadir, gbc_anadir);
				
						quitar = new JButton("");
						quitar.setEnabled(false);
						quitar.setIcon(new ImageIcon(AltaPedido.class.getResource("/recursos/Knob Remove Red.png")));
						GridBagConstraints gbc_quitar = new GridBagConstraints();
						gbc_quitar.insets = new Insets(0, 0, 0, 5);
						gbc_quitar.fill = GridBagConstraints.HORIZONTAL;
						gbc_quitar.anchor = GridBagConstraints.NORTH;
						gbc_quitar.gridx = 7;
						gbc_quitar.gridy = 4;
						panel_1.add(quitar, gbc_quitar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
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

		JLabel lblTotal_1 = new JLabel("TOTAL : 0.00");
		GridBagConstraints gbc_lblTotal_1 = new GridBagConstraints();
		gbc_lblTotal_1.gridx = 0;
		gbc_lblTotal_1.gridy = 3;
		getContentPane().add(lblTotal_1, gbc_lblTotal_1);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		nuevo = new JButton("Nuevo");
		nuevo.setIcon(new ImageIcon(AltaPedido.class.getResource("/recursos/Knob Add.png")));
		menuBar.add(nuevo);
		
		validar = new JButton("Guardar");
		validar.setEnabled(false);
		validar.setIcon(new ImageIcon(AltaPedido.class.getResource("/recursos/Knob Valid Green.png")));
		menuBar.add(validar);
		
		cancelar = new JButton("Cancelar");
		cancelar.setEnabled(false);
		cancelar.setIcon(new ImageIcon(AltaPedido.class.getResource("/recursos/Knob Cancel.png")));
		menuBar.add(cancelar);

	}
}
