package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.Consultorio;

public interface ConsultorioService {
	
	Consultorio crear (Integer idCreador,Consultorio consultorio);
	Consultorio updata(Integer id,Consultorio consultorio);
	List<Consultorio> getByName (String nombre);
	Optional< Consultorio> getByid(Integer id);
	void delete (Integer id);
}
