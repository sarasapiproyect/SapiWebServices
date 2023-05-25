package com.sapi.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sapi.web.services.model.EstatusMarca;

public interface EstatusMarcaRepository extends JpaRepository<EstatusMarca, Integer> {

	@Query(value = "SELECT a.fecha_solic, a.nombre, a.estatus-1000 as estatus, b.descripcion FROM stzderec a, stzstder b WHERE a.estatus=b.estatus and a.tipo_mp='M' and a.solicitud = ?1", nativeQuery = true)
    List<EstatusMarca> buscarEstatusMarcaBySolicitud(String solicitud);
	
	@Query(value = "SELECT a.fecha_solic, a.nombre, a.estatus-1000 as estatus, b.descripcion FROM stzderec a, stzstder b WHERE a.estatus=b.estatus and a.tipo_mp='M' and a.registro= ?1", nativeQuery = true)
    List<EstatusMarca> buscarEstatusMarcaByRegistro(String registro);
	
}
