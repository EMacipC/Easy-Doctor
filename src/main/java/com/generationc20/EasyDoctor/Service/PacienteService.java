package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.generationc20.EasyDoctor.model.Alergia;
import com.generationc20.EasyDoctor.model.HistorialClinico;
import com.generationc20.EasyDoctor.model.HistorialFamiliar;
import com.generationc20.EasyDoctor.model.HistorialNoClinico;
import com.generationc20.EasyDoctor.model.HistorialSexual;
import com.generationc20.EasyDoctor.model.Paciente;

public interface PacienteService {
	
	Paciente crearPaciente(Integer idCons,Paciente paciente);
	List<Paciente> getAll();
	HistorialClinico crearhC(Integer idPaciente,HistorialClinico hC);
	HistorialFamiliar crearhF(Integer idPaciente,HistorialFamiliar hF);
	HistorialNoClinico crearhNC(Integer idPaciente,HistorialNoClinico hNC);
	HistorialSexual crearhS(Integer idPaciente,HistorialSexual hS);
	Alergia crearA(Integer idPaciente,Alergia alergia);
	List<Paciente> getByName(String nombre,Integer idConsultorio);
	List<Paciente> getByIdC(Integer idConsultorio);
	Optional<Paciente> getById(Integer id);
	Paciente updata(Integer id,Paciente paciente);
	void delate(Integer id);
	

}
