package com.sapi.web.services.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stzderec")
public class Stzderec implements Serializable {

	private static final long serialVersionUID = -3644435725972276889L;
		
	@Column(name = "solicitud")
    private String solicitud;
	
    @Column(name = "fecha_solic")
	private Date fechaSolicitud;
    
    @Column(name = "tipo_mp")
    private String tipomp;
    
    @Id
    @Column(name = "estatus")
    private Integer estatus;
    
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

	public String getTipomp() {
		return tipomp;
	}

	public void setTipomp(String tipomp) {
		this.tipomp = tipomp;
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
    
    	
}
