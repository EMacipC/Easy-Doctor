package com.generationc20.EasyDoctor.Service;

import java.util.List;

import com.generationc20.EasyDoctor.model.ConsultorioDoctor;

public interface ConsultorioDoctroService {
	
	ConsultorioDoctor crear(ConsultorioDoctor consDoctor);
	ConsultorioDoctor crearDS(Integer idConsultorio,Integer idDoctor);
	List<ConsultorioDoctor> getAll();
	void delete (Integer id);

}
