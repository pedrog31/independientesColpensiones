package com.sura.misAliados.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sura.misAliados.dominio.consulta.IndependienteConsulta;
import com.sura.misAliados.dominio.modelo.Independiente;
import com.sura.misAliados.dominio.servicio.IndependienteServicio;

@RestController
@RequestMapping("/independiente")
public class IndependienteRest {

	@Autowired
	IndependienteConsulta independienteConsulta;

	@Autowired
	IndependienteServicio independienteServicio;

	@GetMapping(value = "/todos")
	public List<Independiente> consultarListaIndependientes() {
		return independienteConsulta.consultarListaIndependientes();
	}

	@PostMapping(value = "aprobado/{tipoDocumento}/{numeroDocumento}")
	public void aprobarIndependiente(@PathVariable("tipoDocumento") String tipoDocumento,
			@PathVariable("numeroDocumento") String numeroDocumento) {
		independienteServicio.actualizarEstadoIndependiente(tipoDocumento, numeroDocumento, "Aprobado");
	}

	@PostMapping(value = "rechazado/{tipoDocumento}/{numeroDocumento}")
	public void rechazarIndependiente(@PathVariable("tipoDocumento") String tipoDocumento,
			@PathVariable("numeroDocumento") String numeroDocumento) {
		independienteServicio.actualizarEstadoIndependiente(tipoDocumento, numeroDocumento, "Rechazado");
	}

	@PutMapping
	public void registrarIndependiente(@RequestBody Independiente independiente) {
		independienteServicio.registrarIndependiente(independiente);
	}

}
