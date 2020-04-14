package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.ConsultorioSecretariaRepository;
import com.generationc20.EasyDoctor.model.ConsultorioSecretaria;

@Service
public class ConsultorioSecretariaServiceImpl  implements ConsultorioSecretariaService{
	
	@Autowired
	private ConsultorioSecretariaRepository repository;
	
	@Override
	public ConsultorioSecretaria crear(ConsultorioSecretaria consSecretaria) {
		consSecretaria.setFecha(new Date());
		return repository.save(consSecretaria);
	}
	@Override
	public ConsultorioSecretaria crearCS(Integer idSecretaria, Integer idConsultorio) {
		ConsultorioSecretaria cS =new ConsultorioSecretaria();
		cS.setIdConsultorio(idConsultorio);
		cS.setIdSecretaria(idSecretaria);
		return repository.save(cS);
	}
	@Override
	public List<ConsultorioSecretaria> getAll() {
		return repository.findAll();
	}
	@Override
	public void delete(Integer id) {
		
	}

}
