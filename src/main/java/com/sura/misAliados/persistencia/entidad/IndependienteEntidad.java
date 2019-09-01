package com.sura.misAliados.persistencia.entidad;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class IndependienteEntidad {
	
	@Id
	private ObjectId _id;
	private String apellidos;
	private String correo;
	private String estado;
	private Date fechaNacimiento;
	private String ingresosMensualesAprox;
	private String nombres;
	private String numeroDocumento;
	private String oficio;
	private String sexo;
	private String telefono;
	private String tipoDocumento;
	
	public IndependienteEntidad() {	}

	public IndependienteEntidad(ObjectId _id, String apellidos, String correo, String estado, Date fechaNacimiento,
			String ingresosMensualesAprox, String nombres, String numeroDocumento, String oficio, String sexo,
			String telefono, String tipoDocumento) {
		this._id = _id;
		this.apellidos = apellidos;
		this.correo = correo;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
		this.ingresosMensualesAprox = ingresosMensualesAprox;
		this.nombres = nombres;
		this.numeroDocumento = numeroDocumento;
		this.oficio = oficio;
		this.sexo = sexo;
		this.telefono = telefono;
		this.tipoDocumento = tipoDocumento;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getIngresosMensualesAprox() {
		return ingresosMensualesAprox;
	}

	public void setIngresosMensualesAprox(String ingresosMensualesAprox) {
		this.ingresosMensualesAprox = ingresosMensualesAprox;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
}
