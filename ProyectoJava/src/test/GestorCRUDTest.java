package test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import Modelo.Articulo;
import Modelo.DAO;
import Modelo.Lineas;
import Modelo.Pedido;
import Modelo.Persona;
import control.logica.GestorCRUD;
import utiles.Tipo;

public class GestorCRUDTest {

	
	GestorCRUD gestorArticulos;
	GestorCRUD gestorCliente;
	GestorCRUD gestorPedido;
	ArrayList<Articulo> listaArticulo = new ArrayList<Articulo>();
	ArrayList<Persona> listaCliente = new ArrayList<Persona>();
	ArrayList<Pedido> listaPedido = new ArrayList<Pedido>();

	Articulo articuloUno = new Articulo(1, "Pedido", "Detalle", 12.8f);
	Articulo articuloDos = new Articulo(2, "Pedido2", "Detalle2", 12.8f);
	Persona personaUno = new Persona("07268880Y", "Gose", "Ca", "Una");
	Persona personaDos = new Persona("07268880D", "Gose", "Ca", "Una");
	Pedido pedidoUno = new Pedido(new Persona("07268880Y", "Gose", "Ca", "Una"), new ArrayList<Lineas>(), new Date(), 1);
	Pedido pedidoDos = new Pedido(new Persona("07268880Y", "Gose", "Ca", "Una"), new ArrayList<Lineas>(), new Date(), 1);
	
	@Before
	public void llena() {
		new File(Tipo.articulo.getRuta()).delete();
		new File(Tipo.pedido.getRuta()).delete();
		new File(Tipo.cliente.getRuta()).delete();
		gestorArticulos = new GestorCRUD(Tipo.articulo);
		gestorCliente = new GestorCRUD(Tipo.cliente);
		gestorPedido = new GestorCRUD(Tipo.pedido);
	
		// Añadimos a la lista Articulos
		listaArticulo.add(articuloUno);
		listaArticulo.add(articuloDos);
		// Añadimos a la lista de Personas
		listaCliente.add(personaUno);
		listaCliente.add(personaUno);
		// Añadimos a la lista de Pedidos
		listaPedido.add(pedidoUno);
		listaPedido.add(pedidoDos);
		
		//Creamos Archivos 
		gestorArticulos.escribeLista(articuloUno);
		gestorCliente.escribeLista(personaUno);
		
	}

	@Test
	public void testEscribeLista() {
		assertEquals(true, gestorArticulos.escribeLista(articuloUno));
		assertEquals(true, gestorArticulos.escribeLista(articuloDos));
		assertEquals(true, gestorCliente.escribeLista(personaUno));
		assertEquals(true, gestorCliente.escribeLista(personaDos));
	}

	@Test
	public void testGetListaArticulo() {
		assertEquals(listaArticulo.get(0).getID(), gestorArticulos.getListaArticulo().get(0).getID());
	}


	
	@Test
	public void testGetListaPersona() {
		assertEquals(listaCliente.get(0).getDNI(), gestorCliente.getListaPersona().get(0).getDNI());
	}

	@Test
	public void testGetListaPedido() {
		new DAO().grabar(pedidoUno, Tipo.pedido.getRuta(), Tipo.pedido.isLista());
		gestorPedido = new GestorCRUD(Tipo.pedido);
		assertEquals(listaPedido.get(0).getID(), gestorPedido.getListaPedido().get(0).getID());
	}

	@Test
	public void testDevuelveID() {
		assertEquals(1, gestorArticulos.devuelveID());
	}

	@Test
	public void testDameIDPedido() {

		assertEquals(1, gestorPedido.dameIDPedido());
	}

	@Test
	public void testCompruebaDNI() {
		assertEquals(false, gestorCliente.compruebaDNI("07268880Y"));
	}
	}
