package Modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Articulo implements Serializable{

	
	
	
	private int ID;
	private String Nombre;
	private String Detalles; 
	private float Precio;
	
	public Articulo(int iD, String nombre, String detalles, float precio) {
		super();
		this.ID = iD;
		this.Nombre = nombre;
		this.Detalles = detalles;
		this.Precio = precio;
	}

	public int getID() {
		return this.ID;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public String getDetalles() {
		return this.Detalles;
	}

	public float getPrecio() {
		return this.Precio;
	}
}
