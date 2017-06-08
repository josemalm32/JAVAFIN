package Modelo;

import java.io.Serializable;

public class Lineas implements Serializable{
	
	private Articulo articulo;
	private int cantidad;
	private int numeroLinea;
	public Lineas(Articulo articulo, int cantidad, int numeroLinea) {
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.numeroLinea = numeroLinea;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public int getNumeroLinea() {
		return numeroLinea;
	}
	
	
	
}
