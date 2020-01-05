package fr.d4.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RequeteService {

	public ArrayList<String> requetelogin() {
		ArrayList<String> longins = new ArrayList<String>();
		Requete r = new Requete();
		String strQuery= "SELECT idpersonne FROM personne WHERE idpersonne LIKE 'CO%%%%'";
		Statement stServices;
		try {
			stServices = r.getConn().createStatement();
			ResultSet rsServices= stServices.executeQuery(strQuery);
			while(rsServices.next()) { 
				longins.add(rsServices.getString("idpersonne"));
			}
			r.getConn().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return longins;
	}

	public String requeteMdp(String loginValide) {
		String mdp = "";
		Requete r = new Requete();
		String strQuery= "SELECT mdp FROM personne WHERE idpersonne = '"+loginValide+"'";
		Statement stServices;
		try {
			stServices = r.getConn().createStatement();
			ResultSet rsServices= stServices.executeQuery(strQuery);
			while(rsServices.next()) { 
				mdp = rsServices.getString("mdp");
			}
			r.getConn().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mdp;
	}

}
