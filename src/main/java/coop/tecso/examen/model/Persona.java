package coop.tecso.examen.model;

import javax.persistence.Entity;

@Entity
public  class Persona extends AbstractPersistentObject {

	private static final long serialVersionUID = -8901155893511467205L;
	
	private Long rut;

	public Long getRut() {
		return rut;
	}
	public void setRut(Long rut) {
		this.rut = rut;
	}
	
	
}