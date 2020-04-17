package com.generationc20.EasyDoctor.Service;

import java.util.List;

import com.generationc20.EasyDoctor.model.Cita;

public interface CitaService {

	Cita save(Integer idPaciente,Integer idDoctor,Cita cita);
	Cita updata(Integer id,Cita cita);
	Cita getById(Integer id);
	List<Cita> getByFechaP(String fecha,Integer idPaciente);
	List<Cita> getByPaciente(Integer idPaciente);
	List<Cita> getByFechaD(String fecha,Integer idDoctor);
	List<Cita> getByDoctor(Integer idDoctor);
	void delete (Integer id);
	

}
