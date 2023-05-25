package com.sapi.web.services.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component
public class VariablesDetails {
 
    @Value("${list.patentes}")
    private int[] listPatentes;
    
    @Value("${list.clases}")
    private String[] listClases;

	public int[] getListPatentes() {
		return listPatentes;
	}

	public void setListPatentes(int[] listPatentes) {
		this.listPatentes = listPatentes;
	}

	public String[] getListClases() {
		return listClases;
	}

	public void setListClases(String[] listClases) {
		this.listClases = listClases;
	}
 
   
}
