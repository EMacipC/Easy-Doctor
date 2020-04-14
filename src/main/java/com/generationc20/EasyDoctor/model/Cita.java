package com.generationc20.EasyDoctor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idPaciente;
	private Integer idDoctor;
	
	@Column(length=20)
	private String salaConsulta;
	@Column(length=20)
	private String estadoCita;
	@Column(length=30)
	private String fechaAgendada;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	public Cita() {}
	
	

	public Integer getIdDoctor() {
		return idDoctor;
	}



	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}



	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSalaConsulta() {
		return salaConsulta;
	}

	public void setSalaConsulta(String salaConsulta) {
		this.salaConsulta = salaConsulta;
	}

	public String getEstadoCita() {
		return estadoCita;
	}

	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}

	public String getFechaAgendada() {
		return fechaAgendada;
	}

	public void setFechaAgendada(String fechaAgendada) {
		this.fechaAgendada = fechaAgendada;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
