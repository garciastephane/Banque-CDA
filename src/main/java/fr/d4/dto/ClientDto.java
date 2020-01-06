package fr.d4.dto;

import fr.d4.services.RequeteService;

public class ClientDto {
	public Object[][] requeteClient() {
		RequeteService rs = new RequeteService();
		Object[][] data = rs.requeteClient();
		return data;
	}

	public void insertClient(String text, String text2, String text3, String text4) {
		RequeteService rs = new RequeteService();
		rs.insertClient(text, text2,  text3,  text4) ;;	
	}
}
