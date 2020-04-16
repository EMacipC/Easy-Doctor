package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.AlergiaRepository;
import com.generationc20.EasyDoctor.Respository.HistorialClinicoRepository;
import com.generationc20.EasyDoctor.Respository.HistorialFamiliarRepository;
import com.generationc20.EasyDoctor.Respository.HistorialNoClinicoRepository;
import com.generationc20.EasyDoctor.Respository.HistorialSexualRepository;
import com.generationc20.EasyDoctor.Respository.PacienteRespository;
import com.generationc20.EasyDoctor.model.Alergia;
import com.generationc20.EasyDoctor.model.HistorialClinico;
import com.generationc20.EasyDoctor.model.HistorialFamiliar;
import com.generationc20.EasyDoctor.model.HistorialNoClinico;
import com.generationc20.EasyDoctor.model.HistorialSexual;
import com.generationc20.EasyDoctor.model.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService{
	
	@Autowired
	private PacienteRespository repository;
	
	@Autowired
	private HistorialClinicoRepository cRepository;
	
	@Autowired
	private HistorialFamiliarRepository fRepository;
	
	@Autowired
	private HistorialNoClinicoRepository ncRepository;
	
	@Autowired
	private HistorialSexualRepository sRepository;
	@Autowired
	private AlergiaRepository aRepository;
	
	@Override
	public Paciente crearPaciente(Integer idCons,Paciente paciente) {
		paciente.setIdConsultorio(idCons);
		paciente.setFecha(new Date());
		return repository.save(paciente);
	}
	@Override
	public HistorialClinico crearhC(Integer idPaciente, HistorialClinico hC) {
		hC.setIdPaciente(idPaciente);
		hC.setFecha(new Date());
		return cRepository.save(hC);
	}
	@Override
	public Alergia crearA(Integer idPaciente, Alergia alergia) {
		
		alergia.setFecha(new Date());
		return aRepository.save(alergia);
	}
	@Override
	public HistorialFamiliar crearhF(Integer idPaciente, HistorialFamiliar hF) {
		hF.setIdPaciente(idPaciente);
		hF.setFecha(new Date());
		return fRepository.save(hF);
	}
	@Override
	public HistorialNoClinico crearhNC(Integer idPaciente, HistorialNoClinico hNC) {
		hNC.setIdPaciente(idPaciente);
		hNC.setFecha(new Date());
		return ncRepository.save(hNC);
	}
	@Override
	public HistorialSexual crearhS(Integer idPaciente, HistorialSexual hS) {
		hS.setIdPaciente(idPaciente);
		hS.setFecha(new Date());
		return sRepository.save(hS);
	}
	@Override
	public List<Paciente> getAll() {
		return repository.findAll();
	}
	@Override
	public Optional<Paciente> getById(Integer id) {
		return repository.findById(id);
	}
	@Override
	public List<Paciente> getByName(String nombre,Integer idConsultorio){
		return repository.findByName(nombre,idConsultorio);
	}
	@Override
	public List<Paciente> getByIdC(Integer idConsultorio) {
		return repository.findByidC(idConsultorio);
	}
	@Override
	public Paciente updata(Integer id, Paciente paciente) {
		Paciente pacienteDB= getById(id).get();
		pacienteDB.setNombre(paciente.getNombre());
		pacienteDB.setApellido(paciente.getApellido());
		pacienteDB.setCurp(paciente.getCurp());
		pacienteDB.setEmail(paciente.getEmail());
		pacienteDB.setEscolaridad(paciente.getEscolaridad());
		pacienteDB.setFechaNacimiento(paciente.getFechaNacimiento());
		pacienteDB.setMovil(paciente.getMovil());
		pacienteDB.setTelefono(paciente.getTelefono());
		pacienteDB.setOcupacion(paciente.getOcupacion());
		pacienteDB.setTipoSangre(paciente.getTipoSangre());
		pacienteDB.setReligion(paciente.getReligion());
		pacienteDB.setNacionalidad(paciente.getNacionalidad());
		pacienteDB.setSexo(paciente.getSexo());
		return repository.save(pacienteDB);
	}
	@Override
	public void delate(Integer id) {}
}
