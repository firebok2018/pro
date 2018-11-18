package model;

import java.text.DateFormat;
import java.util.Date;

public class Cliente {
	private int codigo;
	private int DNI;
	private String nombre;
	private String Apellido;
	private String Telefono;
	
	public Cliente(int codigo, int dNI, String nombre, String apellido, String telefono) {
		super();
		this.codigo = codigo;
		DNI = dNI;
		this.nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	

	
}
