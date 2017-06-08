package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;



public class Pedido implements Serializable{


	private static final long serialVersionUID = 1L;
	
	
	private Persona cliente;
	private ArrayList<Lineas> listaLineas;
	private Date fecha;
	private int ID;
	
	
	public Pedido(Persona cliente, ArrayList<Lineas> listaLineas, Date fecha, int iD) {
		super();
		this.cliente = cliente;
		this.listaLineas = listaLineas;
		this.fecha = fecha;
		ID = iD;
	}


	public Persona getCliente() {
		return cliente;
	}


	public ArrayList<Lineas> getListaLineas() {
		return listaLineas;
	}


	public Date getFecha() {
		return fecha;
	}


	public int getID() {
		return ID;
	}
	
	
	@Override
	public boolean equals(Object objeto) {
		return (this.ID == ((Pedido)objeto).ID);
	}	
}
