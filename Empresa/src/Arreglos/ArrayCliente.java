package Arreglos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.Cliente;

public class ArrayCliente {
	private ArrayList<Cliente> cli;

	public ArrayCliente() {
		cli = new ArrayList<Cliente>();
		loadCliente();
	}
	public int tamaño(){
		return cli.size();
	}
	public void eliminar(Cliente c){
		cli.remove(c);
	}
	public Cliente obtener(int pos){
		return cli.get(pos);
	}
	public void adicionar(Cliente c){
		cli.add(c);
	}
	public Cliente buscar(int DNI){
		Cliente c;
		for (int i = 0; i < tamaño(); i++) {
			c=obtener(i);
			if (c.getDNI()== DNI) {
				return c;
			}
		}
		return null;
		
	}
	public String codigo(){
		if (tamaño() == 0)
			return "C"+10001;
		else
			return "C"+obtener(tamaño()-1).getCodigo() + 1;		
		
	}

	
	private void loadCliente() {
	/*	
		try{
			BufferedReader br;
			String linea,codigo,dni,nombre,apellido,telefono;
			
			String s[];
			
			br = new BufferedReader(new FileReader("Cliente.txt"));
			while((linea=br.readLine()) != null){
				s = linea.split(";");
				codigo=s[0].trim();
				dni=s[1].trim();
				nombre=s[2].trim();
				apellido=s[3].trim();
				telefono=s[4].trim();
				//adicionar(new Cliente(codigo));
				adicionar(new Cliente(codigo,dni,nombre,apellido,telefono));
			}
			br.close();
		}
		catch(Exception e){
			
		}*/
	}
	private void saveCliente(){
		try{
			PrintWriter pw;
			String linea;
			Cliente c;
			pw = new PrintWriter(new FileWriter("Cliente.txt"));
			for (int i=0; i<tamaño(); i++)
			{
				c=obtener(i);
				linea=	c.getCodigo()+";"+
						c.getDNI()+";"+
						c.getNombre()+";"+
						c.getApellido()+";"+
						c.getTelefono();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e){
			
		}
	}
	
	

}
