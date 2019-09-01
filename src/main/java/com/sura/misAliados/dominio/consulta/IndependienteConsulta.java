package com.sura.misAliados.dominio.consulta;

import java.util.List;

import com.sura.misAliados.dominio.modelo.Independiente;
import com.sura.misAliados.dominio.repositorio.RepositorioIndependiente;

public class IndependienteConsulta {
	
	private RepositorioIndependiente repositorioIndependiente;

	public IndependienteConsulta(RepositorioIndependiente repositorioIndependiente) {
		this.repositorioIndependiente = repositorioIndependiente;
	}

	public List<Independiente> consultarListaIndependientes() {
		return repositorioIndependiente.consultarListaIndependientes();
	}
}
