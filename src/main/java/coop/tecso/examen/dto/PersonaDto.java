package coop.tecso.examen.dto;

import java.io.Serializable;


public abstract class PersonaDto implements Serializable {
	

	private static final long serialVersionUID = -1737700610469175652L;
	
	private Long rut;

	public Long getRut() {
		return rut;
	}

	public void setRut(Long rut) {
		this.rut = rut;
	}

	
}
