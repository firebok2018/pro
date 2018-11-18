package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Conexion {
	
	
	private String database="Empresa";
	private  String url="jdbc:mysql://localhost:3306/"+database;
	private  String user="root";
	private  String pwd="mysql";
	private Connection con = null;
	public Connection getConexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection(url,user,pwd);
			JOptionPane.showMessageDialog(null, "Conectado");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			//Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,e);
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "error Conexion");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return con;
	}

}
