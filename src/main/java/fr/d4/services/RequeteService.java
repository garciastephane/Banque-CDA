package fr.d4.services;

import java.sql.PreparedStatement;
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
		try {
			PreparedStatement ps = r.getConn().prepareStatement("SELECT mdp FROM personne WHERE idpersonne = ?");
			ps.setString(1,loginValide); 
			ResultSet rsServices= ps.executeQuery();
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

	public Object[][] requeteClient() {
		ArrayList<Object[]> objList = new ArrayList<Object[]>();
		Requete r = new Requete();
		try {
			PreparedStatement ps = r.getConn().prepareStatement("SELECT idPersonne,nom,prenom,datenaissance,email FROM personne WHERE idpersonne_avoir NOTNULL AND active = true"); 
			ResultSet rsServices= ps.executeQuery();
			while(rsServices.next()) { 
				Object[] obj = new Object[5]; 
				obj[0] = rsServices.getString("idpersonne");
				obj[1] = rsServices.getString("nom");
				obj[2] = rsServices.getString("prenom");
				obj[3] = rsServices.getString("datenaissance");
				obj[4] = rsServices.getString("email");
				objList.add(obj);
			}
			r.getConn().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object[][] objs = new Object[objList.size()][5]; 
		for (int i = 0; i < objs.length; i++) {
			objs[i] = objList.get(i);
		}
		return objs;
	}

}
