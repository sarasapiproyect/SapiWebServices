package com.sapi.web.services.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stdobras")
public class Stdobras implements Serializable {

	private static final long serialVersionUID = -3644435725972276889L;
		
	@Column(name = "solicitud")
    private String solicitud;
	
    @Column(name = "fecha_solic")
	private Date fechaSolicitud;
    
    @Column(name = "titulo_obra")
    private String tituloObra;
    
    @Id
    @Column(name = "estatus")
    private Integer estatus;
    
    @Column(name = "clase")
    private String clase;
    
    @Column(name = "registro")
    private String registro;

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getTituloObra() {
		return tituloObra;
	}

	public void setTituloObra(String tituloObra) {
		this.tituloObra = tituloObra;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
    
    	
}
