package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.model.Doctor;

import at.favre.lib.crypto.bcrypt.BCrypt;

import com.generationc20.EasyDoctor.Respository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository repository;

	@Override
	public Doctor crear(Doctor doctor) {
//		String password= doctor.getContraseña();
//		String hashPass= BCrypt.withDefaults().hashToString(12, password.toCharArray());
//		doctor.setContraseña(hashPass);
		doctor.setFecha(new Date());
		return repository.save(doctor);
	}
	@Override
	public List<Doctor> getByName(String nombre) {
		return repository.findByName(nombre);
	}

	@Override
	public List<Doctor> getAll() {
		return repository.findAll();
	}

	@Override
	public Doctor update(Integer id, Doctor d) {
		// TODO Auto-generated method stub
		Doctor doctor = getById(id).get();
		doctor.setApelliod(d.getApelliod());
		doctor.setContraseña(d.getContraseña());
		doctor.setDireccion(d.getDireccion());
		doctor.setEmail(d.getEmail());
		doctor.setEspecialidad(d.getEspecialidad());
		doctor.setFecha(d.getFecha());
		doctor.setMovil(d.getMovil());
		doctor.setNombre(d.getNombre());
		doctor.setTelefono(d.getTelefono());
		doctor.setUsuario(d.getUsuario());
		
		return repository.save(doctor);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Doctor> getById(Integer id) {
		return repository.findById(id);
	}

}
