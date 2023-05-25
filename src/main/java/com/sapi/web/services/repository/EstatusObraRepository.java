package com.sapi.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sapi.web.services.model.EstatusObra;

public interface EstatusObraRepository extends JpaRepository<EstatusObra, Integer> {


	@Query(value = "SELECT a.fecha_solic, a.clase, a.titulo_obra, a.estatus, b.descripcion FROM stdobras a, stdstobr b WHERE a.estatus=b.estatus and a.solicitud= ?1", nativeQuery = true)
    List<EstatusObra> buscarEstatusObraBySolicitud(String solicitud);
	
	@Query(value = "SELECT a.fecha_solic, a.clase, a.titulo_obra, a.estatus, b.descripcion FROM stdobras a, stdstobr b WHERE a.estatus=b.estatus and a.registro= ?1", nativeQuery = true)
    List<EstatusObra> buscarEstatusObraByRegistro(String registro);
}
