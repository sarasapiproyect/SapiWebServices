package com.sapi.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sapi.web.services.model.ParecidoGramaticalMarca;

public interface ParecidoGramaticalMarcaRepository extends JpaRepository<ParecidoGramaticalMarca, String> {

	@Query(value = "SELECT solicitud, fecha_solic, nombre, registro FROM stzderec WHERE estatus='1555' and tipo_mp='M' and nombre LIKE ?1", nativeQuery = true)
    List<ParecidoGramaticalMarca> buscarMarcaByNombreComienzo(String nombre);
	
	@Query(value = "SELECT solicitud, fecha_solic, nombre, registro FROM stzderec WHERE estatus='1555' and tipo_mp='M' and nombre = ?1", nativeQuery = true)
    List<ParecidoGramaticalMarca> buscarMarcaByNombre(String nombre);
	
	@Query(value = "SELECT solicitud, fecha_solic, nombre, registro FROM stzderec WHERE estatus='1555' and tipo_mp='M' and nombre LIKE ?1", nativeQuery = true)
    List<ParecidoGramaticalMarca> buscarMarcaByNombreParecido(String nombre);
	
}
