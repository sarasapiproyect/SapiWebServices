package com.sapi.web.services.rest;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.primitives.Ints;
import com.sapi.web.services.model.EstatusMarca;
import com.sapi.web.services.model.EstatusObra;
import com.sapi.web.services.model.EstatusPatente;
import com.sapi.web.services.model.ParecidoGramaticalMarca;
import com.sapi.web.services.repository.EstatusMarcaRepository;
import com.sapi.web.services.repository.EstatusObraRepository;
import com.sapi.web.services.repository.EstatusPatenteRepository;
import com.sapi.web.services.repository.ParecidoGramaticalMarcaRepository;
import com.sapi.web.services.util.VariablesDetails;

@RestController
public class SapiController {
	private static final Logger LOGGER = LogManager.getLogger(SapiController.class);
 
	 @Autowired
	 private VariablesDetails variablesDetails;
	 
	 @Autowired
	 private EstatusMarcaRepository estatusMarcaRepository;
	 
	 @Autowired
	 private EstatusPatenteRepository estatusPatenteRepository;
	 
	 @Autowired
	 private EstatusObraRepository estatusObraRepository;
	 
	 @Autowired
	 private ParecidoGramaticalMarcaRepository gramaticalMarcaRepository;

    
    @GetMapping("/estatusMarcaSolicitud/{solicitud}")  
    public List<EstatusMarca> getEstatusMarcaSolicitud(@PathVariable String solicitud) { 
        LOGGER.info("getEstatusMarcaSolicitud: "+solicitud);
        return estatusMarcaRepository.buscarEstatusMarcaBySolicitud(solicitud); 
    } 

    @GetMapping("/estatusMarcaRegistro/{registro}")  
    public List<EstatusMarca> getEstatusMarcaRegistro(@PathVariable String registro) { 
    	LOGGER.info("getEstatusMarcaRegistro: "+registro);
        return estatusMarcaRepository.buscarEstatusMarcaByRegistro(registro); 
    } 
    
    @GetMapping("/estatusPatenteSolicitud/{solicitud}")  
    public List<EstatusPatente> getEstatusPatenteSolicitud(@PathVariable String solicitud) { 
    	LOGGER.info("getEstatusPatenteSolicitud: "+solicitud);
    	
    	List<EstatusPatente> patentes= estatusPatenteRepository.buscarEstatusPatenteBySolicitud(solicitud);
    	for (EstatusPatente patente: patentes) {
    		int[] values = variablesDetails.getListPatentes();
            int target = patente.getEstatus();
     
            boolean found = Ints.asList(values).contains(target);
    		if (found) {
    			patente.setTitulo("INFORMACION CONFIDENCIAL");
    		}
    	}
        return patentes; 
    } 

    @GetMapping("/estatusPatenteRegistro/{registro}")  
    public List<EstatusPatente> getEstatusPatenteRegistro(@PathVariable String registro) { 
    	LOGGER.info("getEstatusPatenteRegistro: "+registro);
    	List<EstatusPatente> patentes= estatusPatenteRepository.buscarEstatusPatenteByRegistro(registro); 
    	for (EstatusPatente patente: patentes) {
    		int[] values = variablesDetails.getListPatentes();
            int target = patente.getEstatus();
     
            boolean found = Ints.asList(values).contains(target);
    		if (found) {
    			patente.setTitulo("INFORMACION CONFIDENCIAL");
    		}
    	}
    	return patentes; 
    } 
    
    @GetMapping("/estatusObraSolicitud/{solicitud}")  
    public List<EstatusObra> getEstatusObraSolicitud(@PathVariable String solicitud) { 
    	LOGGER.info("getEstatusObraSolicitud: "+solicitud);
    	List<EstatusObra> obras= estatusObraRepository.buscarEstatusObraBySolicitud(solicitud);
    	for (EstatusObra obra: obras) {
    		String[] values = variablesDetails.getListClases();
            String target = obra.getClase();
     
            boolean found = Arrays.asList(values).contains(target);
    		if (found) {
    			obra.setTituloObra("INFORMACION CONFIDENCIAL");
    		}
    	}
        return obras; 
    } 

    @GetMapping("/estatusObraRegistro/{registro}")  
    public List<EstatusObra> getEstatusObraRegistro(@PathVariable String registro) { 
    	LOGGER.info("getEstatusObraRegistro: "+registro);
    	List<EstatusObra> obras= estatusObraRepository.buscarEstatusObraByRegistro(registro); 
    	for (EstatusObra obra: obras) {
    		String[] values = variablesDetails.getListClases();
            String target = obra.getClase();
     
            boolean found = Arrays.asList(values).contains(target);
    		if (found) {
    			obra.setTituloObra("INFORMACION CONFIDENCIAL");
    		}
    	}
    	return obras; 
    } 
    
    @GetMapping("/marcaNombre/{nombre}")  
    public List<ParecidoGramaticalMarca> getMarcaNombre(@PathVariable String nombre) { 
    	LOGGER.info("getMarcaNombre: "+nombre);
        return gramaticalMarcaRepository.buscarMarcaByNombre(nombre); 
    } 
    
    
    @GetMapping("/marcaNombreComienzo/{nombre}")  
    public List<ParecidoGramaticalMarca> getMarcaNombreComienzo(@PathVariable String nombre) { 
    	LOGGER.info("getMarcaNombreComienzo: "+nombre);
    	nombre = nombre + "%";
        return gramaticalMarcaRepository.buscarMarcaByNombreComienzo(nombre); 
    } 
    
    
    @GetMapping("/marcaNombreParecido/{nombre}")  
    public List<ParecidoGramaticalMarca> getMarcaNombreParecido(@PathVariable String nombre) { 
    	LOGGER.info("getMarcaNombreParecido: "+nombre);
    	nombre = "%" + nombre + "%";
        return gramaticalMarcaRepository.buscarMarcaByNombreParecido(nombre); 
    } 
}
