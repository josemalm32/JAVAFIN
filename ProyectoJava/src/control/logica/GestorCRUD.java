package control.logica;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import Modelo.Articulo;
import Modelo.DAO;
import Modelo.Pedido;
import Modelo.Persona;
import utiles.Constantes;
import utiles.Tipo;

public class GestorCRUD {
	private Tipo tipo;
	private DAO dao = new DAO();
	private ArrayList<Articulo> listaArticulos;
	private ArrayList<Persona> listaClientes;
	private ArrayList<Pedido> listaPedido;
	private int IDPedido = 0;

	public GestorCRUD(Tipo tipoTemp) {
		this.tipo = tipoTemp;
		if (tipo == Tipo.cliente) {
			if (new File(Tipo.cliente.getRuta()).exists()) {
				listaClientes = (ArrayList<Persona>) dao.leer(Tipo.cliente.getRuta(), Tipo.cliente.isLista());

			} else {
				listaClientes = new ArrayList<Persona>();
			}
		} else if (tipo == Tipo.articulo) {

			if (new File(Tipo.articulo.getRuta()).exists()) {
				listaArticulos = (ArrayList<Articulo>) dao.leer(Tipo.articulo.getRuta(), Tipo.articulo.isLista());
			} else {
				listaArticulos = new ArrayList<Articulo>();
			}

		} else if (tipo == Tipo.pedido) {
			if (new File(Tipo.pedido.getRuta()).exists()) {
				listaPedido = new ArrayList<Pedido>();
				boolean temporal = true;
				while (temporal) {
					Pedido pedidotemp = (Pedido) dao.leer(Tipo.pedido.getRuta(), Tipo.pedido.isLista());
					if (pedidotemp != null) {
						IDPedido++;
						listaPedido.add(pedidotemp);
					} else {
						temporal = false;
					}
				}
			} else {
				listaPedido = new ArrayList<Pedido>();
			}
		}
	}

	public ArrayList<Articulo> getListaArticulo() {
		return listaArticulos;
	}

	public ArrayList<Persona> getListaPersona() {
		return listaClientes;
	}

	public ArrayList<Pedido> getListaPedido() {
		return listaPedido;
	}

	public int devuelveID() {
		return listaArticulos.size();
	}

	public int dameIDPedido() {
		return this.IDPedido;
	}

	public boolean compruebaDNI(String DNI) {
		
		for (Persona item : listaClientes) {
			if (DNI.equals(item.getDNI().trim()) ) {
				return false;
			}
		}
		
		return true;
	}

	public boolean escribeLista(Object objeto) {
		if (tipo == Tipo.articulo) {
			listaArticulos.add((Articulo) objeto);
			return new DAO().grabar(listaArticulos, tipo.getRuta(), tipo.isLista());
		} else if (tipo == Tipo.cliente) {
			listaClientes.add((Persona) objeto);
			return new DAO().grabar(listaClientes, tipo.getRuta(), tipo.isLista());
		}
		return false;
	}

}
