package fr.d4.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;

public class RequeteService {

	public ArrayList<String> requetelogin() {
		ArrayList<String> longins = new ArrayList<String>();
		Requete r = new Requete();
		try {
			PreparedStatement ps = r.getConn().prepareStatement("SELECT idpersonne FROM personne WHERE idpersonne LIKE 'CO%%%%'");
			ResultSet rsServices= ps.executeQuery();
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
				obj[0] = new JButton(rsServices.getString("idpersonne"));
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

	public void insertAgence(String text, String text2) {
		Requete r = new Requete();
		try {
			PreparedStatement ps = r.getConn().prepareStatement("SELECT max(codeagence) FROM agence ");
			ResultSet rsServices= ps.executeQuery();
			String code = null;
			while(rsServices.next()) { 
				int n = Integer.parseInt(rsServices.getString(1));
				code = String.format("%03d",n+1);
			}
			ps = r.getConn().prepareStatement("INSERT INTO Agence (codeagence, nom, addresse) VALUES(?,?,?)");
			ps.setString(1,code);
			ps.setString(2,text);
			ps.setString(3,text2);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void insertClient(String text, String text2, String text3, String text4) {
		
	}

}
