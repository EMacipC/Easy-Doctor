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
@Table(name="paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idConsultorio;
	
	@Column(length=30)
	private String nombre;
	@Column(length=50)
	private String apellido;
	@Column(length=50)
	private String fechaNacimiento;
	@Column(length=30)
	private String curp;
	@Column(length=10)
	private String telefono;
	@Column(length=10)
	private String movil;
	@Column(length=100)
	private String email;
	@Column(length=10)
	private String sexo;
	@Column(length=5)
	private String tipoSangre;
	@Column(length=50)
	private String nacionalidad;
	@Column(length=50)
	private String religion;
	@Column(length=30)
	private String escolaridad;
	@Column(length=50)
	private String ocupacion;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@OneToMany(targetEntity = HistorialClinico.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name="idPaciente",referencedColumnName = "id")
	private List<HistorialClinico> hC;
	
	@OneToMany(targetEntity= HistorialFamiliar.class, cascade = CascadeType.ALL,fetch= FetchType.LAZY, orphanRemoval=true)
	@JoinColumn(name="idPaciente",referencedColumnName = "id")
	private List<HistorialFamiliar> hF;
	
	@OneToMany(targetEntity=HistorialSexual.class,cascade = CascadeType.ALL,fetch= FetchType.LAZY, orphanRemoval=true)
	@JoinColumn(name="idPaciente",referencedColumnName = "id")
	private List<HistorialSexual> hS;
	
	@OneToMany(targetEntity= HistorialNoClinico.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name="idPaciente",referencedColumnName="id")
	private List<HistorialNoClinico> hNC;
	
	@OneToMany(targetEntity= PacienteAlergia.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name="idPaciente",referencedColumnName="id")
	private List<PacienteAlergia> pacienteAlergia;
	
	@OneToMany(targetEntity= Cita.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name="idPaciente",referencedColumnName="id")
	private List<Cita> cita;
	
	


	public Paciente(Integer id,  String nombre, String apellido, String fechaNacimiento, String curp,
			String telefono, String movil, String email, String sexo, String tipoSangre, String nacionalidad,
			String religion, String escolaridad, String ocupacion, Date fecha, List<HistorialClinico> hC,
			List<HistorialFamiliar> hF, List<HistorialSexual> hS, List<HistorialNoClinico> hNC, List<PacienteAlergia> pacienteAlergia) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.curp = curp;
		this.telefono = telefono;
		this.movil = movil;
		this.email = email;
		this.sexo = sexo;
		this.tipoSangre = tipoSangre;
		this.nacionalidad = nacionalidad;
		this.religion = religion;
		this.escolaridad = escolaridad;
		this.ocupacion = ocupacion;
		this.fecha = fecha;
		this.hC = hC;
		this.hF = hF;
		this.hS = hS;
		this.hNC = hNC;
		this.pacienteAlergia = pacienteAlergia;
	}

	public List<Cita> getCita() {
		return cita;
	}


	public void setCita(List<Cita> cita) {
		this.cita = cita;
	}

	public Paciente() {}


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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(String escolaridad) {
		this.escolaridad = escolaridad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<HistorialClinico> gethC() {
		return hC;
	}

	public void sethC(List<HistorialClinico> hC) {
		this.hC = hC;
	}

	public List<HistorialFamiliar> gethF() {
		return hF;
	}

	public void sethF(List<HistorialFamiliar> hF) {
		this.hF = hF;
	}

	public List<HistorialSexual> gethS() {
		return hS;
	}

	public void sethS(List<HistorialSexual> hS) {
		this.hS = hS;
	}

	public List<HistorialNoClinico> gethNC() {
		return hNC;
	}

	public void sethNC(List<HistorialNoClinico> hNC) {
		this.hNC = hNC;
	}


	public List<PacienteAlergia> getPacienteAlergia() {
		return pacienteAlergia;
	}


	public void setPacienteAlergia(List<PacienteAlergia> pacienteAlergia) {
		this.pacienteAlergia = pacienteAlergia;
	}


	
	
	
	

}
