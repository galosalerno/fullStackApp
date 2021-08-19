package coop.tecso.examen.dto;

import java.io.Serializable;

public class PersonaFisicaDto extends PersonaDto implements Serializable  {
	

	private static final long serialVersionUID = -1737700610469175652L;
	private String name;
	private String lastName;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

