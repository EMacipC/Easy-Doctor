package com.generationc20.EasyDoctor.Service;

import java.util.List;

import com.generationc20.EasyDoctor.model.Alergia;

public interface AlergiaService {
	
	Alergia save(Integer idMedicamento,Alergia alergia);
	List<Alergia> getAll();

}
