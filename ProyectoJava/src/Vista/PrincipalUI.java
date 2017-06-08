package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JPopupMenu;
import javax.swing.WindowConstants;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;
	protected JMenuItem mntmAadirArticulo;
	protected JDesktopPane desktopPane;
	protected JMenuItem mntmConsultarArticulo;
	protected JMenuItem mntmConsultarPedido;
	protected JMenuItem mntmNuevoPedido;
	protected JMenuItem mntmAadirClientes;
	protected JMenuItem mntmConsultarCliente;
	
	public PrincipalUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 679);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArticulos = new JMenu("Articulos");
		menuBar.add(mnArticulos);
		
		 mntmAadirArticulo = new JMenuItem("A\u00F1adir Articulo");

		mnArticulos.add(mntmAadirArticulo);
		
		 mntmConsultarArticulo = new JMenuItem("Consultar Articulo");
		mnArticulos.add(mntmConsultarArticulo);
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		mntmAadirClientes = new JMenuItem("A\u00F1adir Clientes");
		mnClientes.add(mntmAadirClientes);
		
		mntmConsultarCliente = new JMenuItem("Consultar Cliente");
		mnClientes.add(mntmConsultarCliente);
		
		JMenu mnPedidos = new JMenu("Pedidos");
		menuBar.add(mnPedidos);
		
		mntmNuevoPedido = new JMenuItem("Nuevo Pedido");
		mnPedidos.add(mntmNuevoPedido);
		
		mntmConsultarPedido = new JMenuItem("Consultar Pedido");
		mnPedidos.add(mntmConsultarPedido);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		 desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
	}
}
