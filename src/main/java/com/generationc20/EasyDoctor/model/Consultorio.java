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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="consultorio")
public class Consultorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=50)
	private String nombre;
	@Column(length=100)
	private String direccion;
	@Column(length=10)
	private String telefono;
	@Column(length=50)
	private String encargado;
	@Column(length=100,unique = true)
	private String email;
	private transient String claveAcceso;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@OneToMany(targetEntity = ConsultorioSecretaria.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "idConsultorio",referencedColumnName = "id")
	private List<ConsultorioSecretaria> consSecretaria;
	
	@OneToMany(targetEntity = ConsultorioDoctor.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "idConsultrio",referencedColumnName = "id")
	private List<ConsultorioDoctor> consDoctor;
	
	@OneToMany(targetEntity = Paciente.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "idConsultrio",referencedColumnName = "id")
	private List<Paciente> paciente;
	
	public Consultorio() {}
	
	
	
	public Consultorio(Integer id, String nombre, String direccion, String telefono, String encargado, String email,
			String claveAcceso, Date fecha) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.encargado = encargado;
		this.email = email;
		this.claveAcceso = claveAcceso;
		this.fecha = fecha;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClaveAcceso() {
		return claveAcceso;
	}
	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
