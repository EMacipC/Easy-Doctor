package com.generationc20.EasyDoctor.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Consultorio;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Integer> {
	@Query(value="select*from consultorio where nombre= ?",nativeQuery = true)
	List<Consultorio> findByName(String nombre);

}
