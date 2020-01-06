package fr.d4.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Requete {
	private Connection conn ;
	public Requete() {
		String driverName = "org.postgresql.Driver";
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:postgresql://localhost:5432/LCR";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "poche");
		try {
			conn = DriverManager.getConnection(url, props);
		} catch (

		SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
}
