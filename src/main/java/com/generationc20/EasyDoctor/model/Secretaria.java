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
@Table(name="secretaria")
public class Secretaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 	
	private Integer Id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Column(length=100)
	private String nombre;
	@Column(length=100)
	private String apelliod;
	@Column(length=100)
	private String telefono;
	@Column(length=100)
	private String movil;
	@Column(length=100)
	private String direccion;
	@Column(length=100)
	private String email;
	@Column(length=100)
	private String usuario;
	@Column(length=100)
	private transient String contraseña;
	
	@OneToMany(targetEntity = ConsultorioSecretaria.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "idSecretaria",referencedColumnName = "id")
	private List<ConsultorioSecretaria> consSecretaria;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelliod() {
		return apelliod;
	}
	public void setApelliod(String apelliod) {
		this.apelliod = apelliod;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Secretaria () {}
	
}
