package Vista;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlUI.PintaImagen;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.WindowConstants;


import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;
	protected JMenuItem mntmAadirArticulo;
	protected JDesktopPane desktopPane;
	protected JMenuItem mntmConsultarArticulo;
	protected JMenuItem mntmConsultarPedido;
	protected JMenuItem mntmNuevoPedido;
	protected JMenuItem mntmAadirClientes;
	protected JMenuItem mntmConsultarCliente;
	protected JMenuItem salir;
	
	public PrincipalUI() {
		setTitle("JMAGEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 679);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArticulos = new JMenu("Articulos");
		mnArticulos.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Car key.png")));
		menuBar.add(mnArticulos);
		
		 mntmAadirArticulo = new JMenuItem("A\u00F1adir Articulo");
		 mntmAadirArticulo.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Add.png")));

		mnArticulos.add(mntmAadirArticulo);
		
		 mntmConsultarArticulo = new JMenuItem("Consultar Articulo");
		 mntmConsultarArticulo.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Text preview.png")));
		mnArticulos.add(mntmConsultarArticulo);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/People.png")));
		menuBar.add(mnClientes);
		
		mntmAadirClientes = new JMenuItem("A\u00F1adir Clientes");
		mntmAadirClientes.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Add.png")));
		mnClientes.add(mntmAadirClientes);
		
		mntmConsultarCliente = new JMenuItem("Consultar Cliente");
		mntmConsultarCliente.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Text preview.png")));
		mnClientes.add(mntmConsultarCliente);
		
		JMenu mnPedidos = new JMenu("Pedidos");
		mnPedidos.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Shopping cart.png")));
		menuBar.add(mnPedidos);
		
		mntmNuevoPedido = new JMenuItem("Nuevo Pedido");
		mntmNuevoPedido.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Add.png")));
		mnPedidos.add(mntmNuevoPedido);
		
		mntmConsultarPedido = new JMenuItem("Consultar Pedido");
		mntmConsultarPedido.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Text preview.png")));
		mnPedidos.add(mntmConsultarPedido);
		
		salir = new JMenuItem("Salir");
		salir.setIcon(new ImageIcon(PrincipalUI.class.getResource("/recursos/Turn off.png")));
		menuBar.add(salir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		 desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		BufferedImage image;
		try {
			image = ImageIO.read(PrincipalUI.class.getResource("/recursos/fondoJAVA.png"));
			desktopPane.setBorder(new PintaImagen(image));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
