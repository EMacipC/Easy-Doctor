package com.generationc20.EasyDoctor.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Secretaria;
@Repository
public interface SecretariaRepository extends JpaRepository <Secretaria, Integer> {

	@Query(value="select*from secretaria where nombre= ?",nativeQuery = true)
	List<Secretaria> findByName(String nombre);
}
