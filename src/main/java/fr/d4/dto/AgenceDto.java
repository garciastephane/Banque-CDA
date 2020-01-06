package fr.d4.dto;

import fr.d4.services.RequeteService;

public class AgenceDto {

	public void insertAgence(String text, String text2) {
		RequeteService rs = new RequeteService();
		rs.insertAgence(text, text2);
		
	}

}
