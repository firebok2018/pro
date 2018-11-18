package model;

public class Producto {
	private String Codigo;
	private String Nombre;
	private String Tipo;
	private int Stock;
	private double Precio;
	public Producto(String codigo, String nombre, String tipo, int stock, double precio) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Tipo = tipo;
		Stock = stock;
		Precio = precio;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}

}
