package com.sura.misAliados.dominio.servicio;

import com.sura.misAliados.dominio.modelo.Independiente;
import com.sura.misAliados.dominio.repositorio.RepositorioIndependiente;

public class IndependienteServicio {
	
	private RepositorioIndependiente repositorioIndependiente;

	public IndependienteServicio(RepositorioIndependiente repositorioIndependiente) {
		this.repositorioIndependiente = repositorioIndependiente;
	}
	
	public void registrarIndependiente (Independiente independiente) {
		repositorioIndependiente.registrarIndependiente(independiente);
	}
	
	public void actualizarEstadoIndependiente (String tipoDocumento, String numeroDocumento, String estado) {
		repositorioIndependiente.actualizarEstadoIndependiente(tipoDocumento, numeroDocumento, estado);
	}

}
