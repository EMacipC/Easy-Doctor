package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.CitaRepository;
import com.generationc20.EasyDoctor.model.Cita;

@Service
public class CitaServiceImpl implements CitaService {
	
	@Autowired
	private CitaRepository repository;
	
	@Override
	public Cita save(Integer idPaciente,Integer idDoctor,Cita cita) {
		cita.setIdPaciente(idPaciente);
		cita.setIdDoctor(idDoctor);
		cita.setFecha(new Date());
		return repository.save(cita);
	}
	@Override
	public Cita updata(Integer id, Cita cita) {
		Cita citaDB = getById(id);
		citaDB.setEstadoCita(cita.getEstadoCita());
		citaDB.setFechaAgendada(cita.getFechaAgendada());
		citaDB.setSalaConsulta(cita.getEstadoCita());
		citaDB.setIdDoctor(cita.getIdDoctor());
		return repository.save(citaDB);
	}
	@Override
	public Cita getById(Integer id) {
		return repository.findById(id).get();
	}
	@Override
	public List<Cita> getByFecha(String fecha) {
		return repository.findByFecha(fecha);
	}
	@Override
	public void delete(Integer id) {
	}

}
