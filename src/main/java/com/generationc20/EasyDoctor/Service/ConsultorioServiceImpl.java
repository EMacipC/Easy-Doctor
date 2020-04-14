package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.ConsultorioRepository;
import com.generationc20.EasyDoctor.model.Consultorio;

import at.favre.lib.crypto.bcrypt.BCrypt;

@Service
public class ConsultorioServiceImpl implements ConsultorioService {
	
	@Autowired
	private ConsultorioRepository repository;
	
	@Override
	public Consultorio crear(Integer idCreador, Consultorio consultorio) {
		String password= consultorio.getClaveAcceso();
		String hashPass= BCrypt.withDefaults().hashToString(12, password.toCharArray());
		consultorio.setClaveAcceso(hashPass);
		consultorio.setFecha(new Date());
		return repository.save(consultorio);
	}
	@Override
	public Optional<Consultorio> getByid(Integer id) {
		return repository.findById(id);
	}
	@Override
	public Consultorio updata(Integer id, Consultorio consultorio) {
		Consultorio consDB= getByid(id).get();
		consDB.setDireccion(consultorio.getDireccion());
		consDB.setEmail(consultorio.getEmail());
		consDB.setNombre(consultorio.getNombre());
		consDB.setEncargado(consultorio.getEncargado());
		consDB.setTelefono(consultorio.getTelefono());
		return repository.save(consDB);
	}
	@Override
	public List<Consultorio> getByName(String nombre) {
		return repository.findByName(nombre);
	}
	@Override
	public void delete(Integer id) {
		
	}

}
