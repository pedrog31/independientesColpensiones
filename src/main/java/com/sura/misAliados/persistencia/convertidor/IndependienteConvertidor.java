package com.sura.misAliados.persistencia.convertidor;

import org.springframework.stereotype.Service;

import com.sura.misAliados.dominio.modelo.Independiente;
import com.sura.misAliados.persistencia.entidad.IndependienteEntidad;

@Service
public class IndependienteConvertidor {

	public Independiente convertirAIndependiente (IndependienteEntidad independienteEntidad) {
		return new Independiente (
				independienteEntidad.getApellidos(),
				independienteEntidad.getCorreo(),
				independienteEntidad.getEstado(),
				independienteEntidad.getFechaNacimiento(),
				independienteEntidad.getIngresosMensualesAprox(),
				independienteEntidad.getNombres(),
				independienteEntidad.getNumeroDocumento(),
				independienteEntidad.getOficio(),
				independienteEntidad.getSexo(),
				independienteEntidad.getTelefono(),
				independienteEntidad.getTipoDocumento());
	}

	public IndependienteEntidad convertirAIndependienteEntidad (Independiente independiente) {
		return new IndependienteEntidad (
				independiente.getApellidos(),
				independiente.getCorreo(),
				independiente.getEstado(),
				independiente.getFechaNacimiento(),
				independiente.getIngresosMensualesAprox(),
				independiente.getNombres(),
				independiente.getNumeroDocumento(),
				independiente.getOficio(),
				independiente.getSexo(),
				independiente.getTelefono(),
				independiente.getTipoDocumento());
	}
}
