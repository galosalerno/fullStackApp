package coop.tecso.examen.model;

import javax.persistence.Entity;

@Entity
public class PersonaFisica extends Persona {

	private static final long serialVersionUID = -8901155893511467205L;
	
	
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