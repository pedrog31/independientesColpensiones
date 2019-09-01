package com.sura.misAliados.dominio.servicio;

import com.sura.misAliados.dominio.modelo.Independiente;
import com.sura.misAliados.dominio.repositorio.IndependienteRepositorio;

public class IndependienteServicio {
	
	private IndependienteRepositorio independienteRepositorio;

	public IndependienteServicio(IndependienteRepositorio independienteRepositorio) {
		this.independienteRepositorio = independienteRepositorio;
	}
	
	public void registrarIndependiente (Independiente independiente) {
		independienteRepositorio.registrarIndependiente(independiente);
	}
	
	public void actualizarEstadoIndependiente (String tipoDocumento, String numeroDocumento, String estado) {
		independienteRepositorio.actualizarEstadoIndependiente(tipoDocumento, numeroDocumento, estado);
	}

}
