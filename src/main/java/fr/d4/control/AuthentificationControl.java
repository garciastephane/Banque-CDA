package fr.d4.control;

import java.util.ArrayList;

import fr.d4.dto.AuthentificationDto;

public class AuthentificationControl {
	public boolean Valide(String login, String password) {
		boolean flag = false;
		AuthentificationDto ad = new AuthentificationDto();
		String loginValide = null;
		ArrayList<String> logins = ad.requetelogin();
		for (String string : logins) {
			if (login.equals(string)) {
				loginValide = string;
			}
		}
		if (loginValide != null) {
			String mdp =  ad.requeteMdp(loginValide);
			if (mdp.equals(password)) {
				flag = true;
			}
		}
		
		return flag;
	}

	
}
