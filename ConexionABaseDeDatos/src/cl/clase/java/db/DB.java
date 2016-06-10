package cl.clase.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.128:3306/curso", "alumnos", "java123");
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery("select * from alumnos");
//			PreparedStatement pstatementInsert = conexion.prepareStatement("Insert INTO alumnos (idalumno, nombre, apellido, apellidoMaterno)" + " VALUES (?,?,?,?);");
//			
//			pstatementInsert.setInt(1, 12);
//			pstatementInsert.setString(2, "James");
//			pstatementInsert.setString(3, "Gosling");
//			pstatementInsert.setString(4, "Lion");
//			int resultpInsert = pstatementInsert.executeUpdate();
			
			while (rs.next()){
			
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
	
		

		
			
		
		
		}
	

}


