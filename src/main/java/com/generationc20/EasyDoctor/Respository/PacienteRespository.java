package com.generationc20.EasyDoctor.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Paciente;

@Repository
public interface PacienteRespository extends JpaRepository<Paciente, Integer>{
	
	@Query(value="select*from paciente where nombre= ? and id_Consultorio=?",nativeQuery = true)
	List<Paciente> findByName(String nombre,Integer idConsultorio);
	
	@Query(value="select*from paciente where id_Consultorio= ?",nativeQuery = true)
	List<Paciente> findByidC(Integer idConsultorio);
}
