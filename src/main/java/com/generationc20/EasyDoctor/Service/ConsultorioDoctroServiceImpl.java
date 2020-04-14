package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.ConsultorioDoctorRepository;
import com.generationc20.EasyDoctor.model.ConsultorioDoctor;

@Service
public class ConsultorioDoctroServiceImpl implements ConsultorioDoctroService {
	
	@Autowired
	private ConsultorioDoctorRepository reposity;
	
	@Override
	public ConsultorioDoctor crear(ConsultorioDoctor consDoctor) {
		consDoctor.setFecha(new Date());
		return reposity.save(consDoctor);
	}
	@Override
	public ConsultorioDoctor crearDS(Integer idConsultorio, Integer idDoctor) {
		ConsultorioDoctor cD=new ConsultorioDoctor();
		cD.setIdConsultorio(idConsultorio);
		cD.setIdDoctor(idDoctor);
		return reposity.save(cD);
	}
	@Override
	public List<ConsultorioDoctor> getAll() {
		return reposity.findAll();
	}
	@Override
	public void delete(Integer id) {
		
	}

}
