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
@Table(name="consultorioSecretaria")
public class ConsultorioSecretaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idConsultorio;
	private Integer idSecretaria;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	public ConsultorioSecretaria() {}

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

	public Integer getIdSecretaria() {
		return idSecretaria;
	}

	public void setIdSecretaria(Integer idSecretaria) {
		this.idSecretaria = idSecretaria;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
