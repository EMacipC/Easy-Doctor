package com.generationc20.EasyDoctor.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Paciente;

@Repository
public interface PacienteRespository extends JpaRepository<Paciente, Integer>{
	
	@Query(value="select*from paciente where nombre= ?",nativeQuery = true)
	List<Paciente> findByName(String nombre);
}
