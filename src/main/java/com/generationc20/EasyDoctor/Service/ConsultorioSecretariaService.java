package com.generationc20.EasyDoctor.Service;

import java.util.List;

import com.generationc20.EasyDoctor.model.ConsultorioSecretaria;

public interface ConsultorioSecretariaService {
	
	ConsultorioSecretaria crear(ConsultorioSecretaria consSecretaria);
	ConsultorioSecretaria crearCS(Integer idSecretaria,Integer idConsultorio);
	List<ConsultorioSecretaria> getAll();
	void delete (Integer id);

}
