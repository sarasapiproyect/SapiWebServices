package com.sapi.web.services.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstatusObra implements Serializable {

	private static final long serialVersionUID = -3644435725972276889L;
		

    @Column(name = "fecha_solic")
	private Date fechaSolicitus;
    
    @Column(name = "clase")
    private String clase;
    
    @Column(name = "titulo_obra")
    private String tituloObra;
    
    @Id
    @Column(name = "estatus")
    private Integer estatus;
    
    @Column(name = "descripcion")
    private String descripcion;

	public Date getFechaSolicitus() {
		return fechaSolicitus;
	}

	public void setFechaSolicitus(Date fechaSolicitus) {
		this.fechaSolicitus = fechaSolicitus;
	}

	
	public String getTituloObra() {
		return tituloObra;
	}

	public void setTituloObra(String tituloObra) {
		this.tituloObra = tituloObra;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
    
   
}
