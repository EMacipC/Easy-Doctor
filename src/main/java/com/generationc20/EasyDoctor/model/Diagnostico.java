package com.generationc20.EasyDoctor.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="DIAGNOSTICO")
public class Diagnostico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DIAGNOSTICO_ID")
	private Integer Id;
	
	@Column(length = 255)
	private String specificaciones;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getSpecificaciones() {
		return specificaciones;
	}

	public void setSpecificaciones(String specificaciones) {
		this.specificaciones = specificaciones;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	} 

}
