package com.generationc20.EasyDoctor.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer>{

	@Query(value="select*from cita where fecha_agendada=? and id_Paciente =?",nativeQuery = true)
	List<Cita> findByFechaP(String fechaAgendada,Integer idPaciente);
	@Query(value="select*from cita where id_Paciente=?",nativeQuery = true)
	List<Cita> findByPaciente(Integer idPaciente);
	@Query(value="select*from cita where fecha_agendada=? and id_Doctor =?",nativeQuery = true)
	List<Cita> findByFechaD(String fechaAgendada,Integer idDoctor);
	@Query(value="select*from cita where id_Paciente=?",nativeQuery = true)
	List<Cita> findByDocotr(Integer idDoctor);
}
