package Vista;



import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class NuevoArticuloUI extends JInternalFrame {
	protected JTextField idTexField;
	protected JTextField nombreText;
	protected JTextField PrecioText;
	protected JButton btnCancelar;
	protected JButton btnGuardar;
	protected JButton btnNuevo;
	protected JTextPane DetallePane;
	
	public NuevoArticuloUI() {
		setTitle("Alta Articulo");
		setBounds(100, 100, 630, 431);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{76, 140, 42, 65, 242, 0};
		gridBagLayout.rowHeights = new int[]{51, 20, 108, 118, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblAltaArticulos = new JLabel("Alta Articulos");
		lblAltaArticulos.setFont(new Font("Tahoma", Font.PLAIN, 42));
		GridBagConstraints gbc_lblAltaArticulos = new GridBagConstraints();
		gbc_lblAltaArticulos.gridwidth = 5;
		gbc_lblAltaArticulos.anchor = GridBagConstraints.NORTH;
		gbc_lblAltaArticulos.insets = new Insets(0, 0, 5, 0);
		gbc_lblAltaArticulos.gridx = 0;
		gbc_lblAltaArticulos.gridy = 0;
		getContentPane().add(lblAltaArticulos, gbc_lblAltaArticulos);
		
		JLabel lblNombreArticulo = new JLabel("Nombre Articulo");
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 0;
		gbc_lblNombreArticulo.gridy = 1;
		getContentPane().add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		nombreText = new JTextField();
		nombreText.setEnabled(false);
		nombreText.setColumns(10);
		GridBagConstraints gbc_nombreText = new GridBagConstraints();
		gbc_nombreText.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreText.insets = new Insets(0, 0, 5, 5);
		gbc_nombreText.gridx = 1;
		gbc_nombreText.gridy = 1;
		getContentPane().add(nombreText, gbc_nombreText);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 1;
		getContentPane().add(lblId, gbc_lblId);
		
		idTexField = new JTextField();
		idTexField.setEnabled(false);
		idTexField.setEditable(false);
		idTexField.setColumns(10);
		GridBagConstraints gbc_idTexField = new GridBagConstraints();
		gbc_idTexField.fill = GridBagConstraints.HORIZONTAL;
		gbc_idTexField.insets = new Insets(0, 0, 5, 0);
		gbc_idTexField.gridx = 4;
		gbc_idTexField.gridy = 1;
		getContentPane().add(idTexField, gbc_idTexField);
		
		JLabel lblPreciound = new JLabel("Precio/Und");
		GridBagConstraints gbc_lblPreciound = new GridBagConstraints();
		gbc_lblPreciound.anchor = GridBagConstraints.EAST;
		gbc_lblPreciound.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreciound.gridx = 0;
		gbc_lblPreciound.gridy = 2;
		getContentPane().add(lblPreciound, gbc_lblPreciound);
		
		PrecioText = new JTextField();
		PrecioText.setEnabled(false);
		PrecioText.setColumns(10);
		GridBagConstraints gbc_PrecioText = new GridBagConstraints();
		gbc_PrecioText.fill = GridBagConstraints.HORIZONTAL;
		gbc_PrecioText.insets = new Insets(0, 0, 5, 5);
		gbc_PrecioText.gridx = 1;
		gbc_PrecioText.gridy = 2;
		getContentPane().add(PrecioText, gbc_PrecioText);
		
		JLabel lblDetalles = new JLabel("Detalles");
		GridBagConstraints gbc_lblDetalles = new GridBagConstraints();
		gbc_lblDetalles.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDetalles.insets = new Insets(0, 0, 0, 5);
		gbc_lblDetalles.gridx = 0;
		gbc_lblDetalles.gridy = 3;
		getContentPane().add(lblDetalles, gbc_lblDetalles);
		
		DetallePane = new JTextPane();
		DetallePane.setEnabled(false);
		GridBagConstraints gbc_DetallePane = new GridBagConstraints();
		gbc_DetallePane.gridwidth = 3;
		gbc_DetallePane.insets = new Insets(0, 0, 0, 5);
		gbc_DetallePane.fill = GridBagConstraints.BOTH;
		gbc_DetallePane.gridx = 1;
		gbc_DetallePane.gridy = 3;
		getContentPane().add(DetallePane, gbc_DetallePane);
		 
		 JMenuBar menuBar = new JMenuBar();
		 setJMenuBar(menuBar);
		 
		 btnNuevo = new JButton("Nuevo");
		 btnNuevo.setIcon(new ImageIcon(NuevoArticuloUI.class.getResource("/recursos/Knob Add.png")));
		 menuBar.add(btnNuevo);
		 
		 btnGuardar = new JButton("Guardar");
		 btnGuardar.setEnabled(false);
		 btnGuardar.setIcon(new ImageIcon(NuevoArticuloUI.class.getResource("/recursos/Knob Valid Green.png")));
		 menuBar.add(btnGuardar);
		 
		 btnCancelar = new JButton("Cancelar");
		 btnCancelar.setEnabled(false);
		 btnCancelar.setIcon(new ImageIcon(NuevoArticuloUI.class.getResource("/recursos/Knob Cancel.png")));
		 menuBar.add(btnCancelar);

	}



}
