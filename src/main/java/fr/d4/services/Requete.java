package fr.d4.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Requete {
	public void Connect() {
		String driverName= "org.postgresql.Driver";
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		String url = "jdbc:postgresql://localhost:5432/TestCDA";
		Properties props= new Properties(); props.setProperty("user","postgres");
		props.setProperty("password","admin");
		try {
			Connection conn = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
