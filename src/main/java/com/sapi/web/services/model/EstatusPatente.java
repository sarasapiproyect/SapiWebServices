package com.sapi.web.services.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstatusPatente implements Serializable {

	private static final long serialVersionUID = -3644435725972276889L;
		

    @Column(name = "fecha_solic")
	private Date fechaSolicitus;
    
    @Column(name = "titulo")
    private String titulo;
    
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
    
   
}
