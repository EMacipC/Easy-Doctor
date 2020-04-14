package com.generationc20.EasyDoctor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="consultoriodoctor")
public class ConsultorioDoctor {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	private Integer idConsultorio;
	private Integer idDoctor;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public ConsultorioDoctor() {}
	

	public ConsultorioDoctor(Integer id, Integer idConsultorio, Integer idDoctor, Date fecha) {
		this.id = id;
		this.idConsultorio = idConsultorio;
		this.idDoctor = idDoctor;
		this.fecha = fecha;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdConsultorio() {
		return idConsultorio;
	}

	public void setIdConsultorio(Integer idConsultorio) {
		this.idConsultorio = idConsultorio;
	}

	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
