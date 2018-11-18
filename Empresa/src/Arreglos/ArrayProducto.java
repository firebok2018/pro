package Arreglos;

import java.util.ArrayList;

import model.Producto;

public class ArrayProducto {
	private ArrayList<Producto> pro;

	public ArrayProducto() {
		pro = new ArrayList<Producto>();
		loadProducto();
	}
	public int tamaño(){
		return pro.size();
	}
	public void eliminar(Producto p){
		pro.remove(p);
	}
	public void adicionar(Producto p){
		pro.add(p);
	}
	public Producto obtener(int pos){
		return pro.get(pos);
	}
	public Producto buscar(String codigo){
		Producto p;
		for (int i = 0; i < tamaño(); i++) {
			p= obtener(i);
			if(p.getCodigo()==codigo){
				return p;
			}
		}
		
		return null;
	}
	
	/*public int Codigo(){
		if (tamaño() == 0)
			return 10001;
		else
			return obtener(tamaño()-1).getCodigo() + 1;	
	}*/

	private void loadProducto() {
		// TODO Auto-generated method stub
		
	}
	

}
