package com.sapi.web.services.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstatusMarca implements Serializable {

	private static final long serialVersionUID = -3644435725972276889L;
		

    @Column(name = "fecha_solic")
	private Date fechaSolicitud;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Id
    @Column(name = "estatus")
    private Integer estatus;
    
    @Column(name = "descripcion")
    private String descripcion;

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
