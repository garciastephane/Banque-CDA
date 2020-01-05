package fr.d4.dto;

import java.util.ArrayList;

import fr.d4.services.RequeteService;

public class AuthentificationDto {
	public ArrayList<String> requetelogin() {
		RequeteService rs = new RequeteService();
		ArrayList<String> longins = rs.requetelogin();
		return longins;
	}

	public String requeteMdp(String loginValide) {
		RequeteService rs = new RequeteService();
		String password = rs.requeteMdp(loginValide);
		return password;
	}
}
