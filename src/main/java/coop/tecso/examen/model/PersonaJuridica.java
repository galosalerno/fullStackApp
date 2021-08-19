package coop.tecso.examen.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class PersonaJuridica extends Persona {

	private static final long serialVersionUID = -8901155893511467205L;
	
	
	private String razonSocial;
	private Date fechaFundacion;
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Date getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	
}