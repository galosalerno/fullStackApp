package coop.tecso.examen.dto;

import java.io.Serializable;
import java.util.Date;

public class PersonaJuridicaDto extends PersonaDto implements Serializable  {
	

	private static final long serialVersionUID = -1737700610469175652L;
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

