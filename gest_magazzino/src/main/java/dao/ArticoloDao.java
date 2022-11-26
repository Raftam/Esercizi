package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Articolo;

public class ArticoloDao {

public void insert(Articolo a) throws SQLException {
		
		Connection conn= null;
		PreparedStatement prp=null;
		
		String driver= "com.mysql.jdbc.Driver";
//EFFETTUO LA CONNESSIONE AL DB magazzino		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "Raffaele", "provola");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Connessione al DB_magazzino effettuata con successo!");
		}
		
//ESEGUO LA QUERY
		String query= "INSERT INTO articolo(descrizione, quantita)VALUES(?,?)";
		
		try {
			prp = conn.prepareStatement(query);
			prp.setString(1, a.getDescrizione());
			prp.setInt(2, a.getQuantita());
			
			prp.executeUpdate();
			System.out.print("Query inserita correttamente!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(prp != null) {
				prp.close();
			}
			if(conn!= null){
				conn.close();
			}
			
		}
		
	}
	
}
