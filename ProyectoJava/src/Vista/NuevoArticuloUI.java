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


public class NuevoArticuloUI extends JInternalFrame {
	protected JTextField idTexField;
	protected JTextField nombreText;
	protected JTextField PrecioText;
	protected JButton btnValidar;
	protected JTextPane DetallePane;
	
	public NuevoArticuloUI() {
		setTitle("Nuevo Articulo");
		setBounds(100, 100, 630, 431);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{76, 140, 42, 65, 242, 0};
		gridBagLayout.rowHeights = new int[]{51, 20, 23, 209, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		getContentPane().add(lblId, gbc_lblId);
		
		idTexField = new JTextField();
		idTexField.setEditable(false);
		idTexField.setColumns(10);
		GridBagConstraints gbc_idTexField = new GridBagConstraints();
		gbc_idTexField.fill = GridBagConstraints.HORIZONTAL;
		gbc_idTexField.insets = new Insets(0, 0, 5, 5);
		gbc_idTexField.gridx = 1;
		gbc_idTexField.gridy = 0;
		getContentPane().add(idTexField, gbc_idTexField);
		
		JLabel lblAltaArticulos = new JLabel("Alta Articulos");
		lblAltaArticulos.setFont(new Font("Tahoma", Font.PLAIN, 42));
		GridBagConstraints gbc_lblAltaArticulos = new GridBagConstraints();
		gbc_lblAltaArticulos.anchor = GridBagConstraints.NORTH;
		gbc_lblAltaArticulos.insets = new Insets(0, 0, 5, 0);
		gbc_lblAltaArticulos.gridx = 4;
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
		nombreText.setColumns(10);
		GridBagConstraints gbc_nombreText = new GridBagConstraints();
		gbc_nombreText.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreText.insets = new Insets(0, 0, 5, 5);
		gbc_nombreText.gridx = 1;
		gbc_nombreText.gridy = 1;
		getContentPane().add(nombreText, gbc_nombreText);
		
		JLabel lblPreciound = new JLabel("Precio/Und");
		GridBagConstraints gbc_lblPreciound = new GridBagConstraints();
		gbc_lblPreciound.anchor = GridBagConstraints.EAST;
		gbc_lblPreciound.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreciound.gridx = 0;
		gbc_lblPreciound.gridy = 2;
		getContentPane().add(lblPreciound, gbc_lblPreciound);
		
		PrecioText = new JTextField();
		PrecioText.setColumns(10);
		GridBagConstraints gbc_PrecioText = new GridBagConstraints();
		gbc_PrecioText.fill = GridBagConstraints.HORIZONTAL;
		gbc_PrecioText.insets = new Insets(0, 0, 5, 5);
		gbc_PrecioText.gridx = 1;
		gbc_PrecioText.gridy = 2;
		getContentPane().add(PrecioText, gbc_PrecioText);
		
		btnValidar = new JButton("Validar");
		
		GridBagConstraints gbc_btnValidar = new GridBagConstraints();
		gbc_btnValidar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnValidar.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidar.gridx = 3;
		gbc_btnValidar.gridy = 2;
		getContentPane().add(btnValidar, gbc_btnValidar);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 2;
		getContentPane().add(btnCancelar, gbc_btnCancelar);
		
		JLabel lblDetalles = new JLabel("Detalles");
		GridBagConstraints gbc_lblDetalles = new GridBagConstraints();
		gbc_lblDetalles.anchor = GridBagConstraints.EAST;
		gbc_lblDetalles.insets = new Insets(0, 0, 0, 5);
		gbc_lblDetalles.gridx = 0;
		gbc_lblDetalles.gridy = 3;
		getContentPane().add(lblDetalles, gbc_lblDetalles);
		
		 DetallePane = new JTextPane();
		 GridBagConstraints gbc_DetallePane = new GridBagConstraints();
		 gbc_DetallePane.fill = GridBagConstraints.BOTH;
		 gbc_DetallePane.gridwidth = 4;
		 gbc_DetallePane.gridx = 1;
		 gbc_DetallePane.gridy = 3;
		 getContentPane().add(DetallePane, gbc_DetallePane);

	}

}
