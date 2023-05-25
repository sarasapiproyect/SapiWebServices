package com.sapi.web.services.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParecidoGramaticalMarca implements Serializable {

	private static final long serialVersionUID = -3644435725972276889L;
		
	@Id
	@Column(name = "solicitud")
    private String solicitud;
	
    @Column(name = "fecha_solic")
	private Date fechaSolicitus;
    
    @Column(name = "nombre")
    private String nombre;
      
  
    @Column(name = "registro")
    private String registro;

    
	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public Date getFechaSolicitus() {
		return fechaSolicitus;
	}

	public void setFechaSolicitus(Date fechaSolicitus) {
		this.fechaSolicitus = fechaSolicitus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	
   
}
