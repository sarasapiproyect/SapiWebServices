package com.sapi.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sapi.web.services.model.EstatusPatente;

public interface EstatusPatenteRepository extends JpaRepository<EstatusPatente, Integer> {


	@Query(value = "SELECT a.fecha_solic, a.nombre as titulo, a.estatus-2000 as estatus, b.descripcion FROM stzderec a, stzstder b WHERE a.estatus=b.estatus and a.tipo_mp='P' and a.solicitud= ?1", nativeQuery = true)
    List<EstatusPatente> buscarEstatusPatenteBySolicitud(String solicitud);
	
	@Query(value = "SELECT a.fecha_solic, a.nombre as titulo, a.estatus-2000 as estatus, b.descripcion FROM stzderec a, stzstder b WHERE a.estatus=b.estatus and a.tipo_mp='P' and a.registro= ?1", nativeQuery = true)
    List<EstatusPatente> buscarEstatusPatenteByRegistro(String registro);
}
