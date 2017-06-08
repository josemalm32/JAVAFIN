package Modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Persona implements Serializable{

	private String DNI;
	private String Nombre;
	private String Apellido;
	private String Direccion;
	
	public Persona(String dNI, String nombre, String apellido, String direccion) {
		super();
		this.DNI = dNI;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Direccion = direccion;
	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public String getDireccion() {
		return Direccion;
	} 
		
		
}
