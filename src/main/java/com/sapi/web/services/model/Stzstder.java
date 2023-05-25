package com.sapi.web.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stzstder")
public class Stzstder implements Serializable {

	private static final long serialVersionUID = -3644435725972276889L;
		
	@Column(name = "descripcion")
    private String descripcion;
	    
    @Id
    @Column(name = "estatus")
    private Integer estatus;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
    
  
    	
}
