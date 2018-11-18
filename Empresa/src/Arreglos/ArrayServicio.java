package Arreglos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.Servicio;

public class ArrayServicio {
	ArrayList<Servicio> servi;

	public ArrayServicio() {
		servi = new ArrayList<Servicio>();
		cargarServicio();
	}
	public int tamaño(){
		return servi.size();
	}
	public void adicionar(){
		
	}
	
	public void eliminar(){
		
	}
	public Servicio obtener(int pos) {
		// TODO Auto-generated method stub
		return servi.get(pos);
	}

	public Servicio buscar(int codigo){
		Servicio s;
		for (int i = 0; i < tamaño(); i++) {
			s=obtener(i);
			if (codigo == s.getCodigo()) {
				return s;
				
			}
		}
		return null;
	}
	
	private void cargarServicio() {
		// TODO Auto-generated method stub
		
	}
	private void saveServicio(){
		try{
			PrintWriter pw;
			String linea;
			Servicio b;
			pw = new PrintWriter(new FileWriter("BoxMesa.txt"));
			for (int i=0; i<tamaño(); i++)
			{
				b = obtener(i);
				linea=	b.getCodigo()+";"+
						b.getNomServi()+";"+
						b.getPlaca()+";"+
						b.getDescripcion();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e){
			
		}
	}
	
}
