package com.generationc20.EasyDoctor.Service;
import java.util.List;
import java.util.Optional;


import com.generationc20.EasyDoctor.model.Secretaria;

public interface SecretariaService {
	Secretaria crear(Secretaria secretaria);
	List<Secretaria> getByName(String nombre);
	List<Secretaria> getAll();
	Secretaria update(Integer id, Secretaria d);
	void delete(Integer id);
	Optional<Secretaria> getById(Integer id);
}
