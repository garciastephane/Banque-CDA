package fr.d4.dto;

import fr.d4.services.RequeteService;

public class ClientDto {
	public Object[][] requeteClient() {
		RequeteService rs = new RequeteService();
		Object[][] data = rs.requeteClient();
		return data;
	}
}
