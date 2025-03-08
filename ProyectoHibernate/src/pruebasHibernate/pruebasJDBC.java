package pruebasHibernate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class pruebasJDBC {

	
	public static void main(String[] args) {
	
		String url = "jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		String user="root";
		String pass="mysql";
		try {
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			System.out.print("Exitoso");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
