package com.sura.misAliados.dominio.repositorio;

import java.util.List;

import com.sura.misAliados.dominio.modelo.Independiente;

public interface IndependienteRepositorio {

	public List<Independiente> consultarListaIndependientes();
	
	public void registrarIndependiente (Independiente independiente);
	
	public void actualizarEstadoIndependiente (String tipoDocumento, String numeroDocumento, String estado);

}
