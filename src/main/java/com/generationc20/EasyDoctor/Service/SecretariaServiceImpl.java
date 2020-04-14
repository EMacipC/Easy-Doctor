package com.generationc20.EasyDoctor.Service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.model.Doctor;
import com.generationc20.EasyDoctor.model.Secretaria;
import com.generationc20.EasyDoctor.Respository.SecretariaRepository;

@Service
public class SecretariaServiceImpl implements SecretariaService {
	
	@Autowired
	private SecretariaRepository repository;

	@Override
	public Secretaria crear(Integer idSecretaria, Secretaria secretaria) {
		secretaria.setId(idSecretaria);
		secretaria.setFecha(new Date());
		return secretaria;
	}

	@Override
	public List<Secretaria> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Secretaria update(Integer id, Secretaria s) {
		// TODO Auto-generated method stub
		Secretaria secretaria = getById(id).get();
		secretaria.setApelliod(s.getApelliod());
		secretaria.setContraseña(s.getContraseña());
		secretaria.setDireccion(s.getDireccion());
		secretaria.setEmail(s.getEmail());
		secretaria.setFecha(s.getFecha());
		secretaria.setMovil(s.getMovil());
		secretaria.setNombre(s.getNombre());
		secretaria.setTelefono(s.getTelefono());
		secretaria.setUsuario(s.getUsuario());
		
		return repository.save(secretaria);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Secretaria> getById(Integer id) {
		return repository.findById(id);
	}

}
