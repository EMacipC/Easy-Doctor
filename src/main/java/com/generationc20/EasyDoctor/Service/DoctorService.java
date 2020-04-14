package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.Doctor;




public interface DoctorService {
	Doctor crear(Doctor doctor);
	List<Doctor> getAll();
	Doctor update(Integer id, Doctor d);
	void delete(Integer id);
	Optional<Doctor> getById(Integer id);
	List<Doctor> getByName(String nombre);
}
