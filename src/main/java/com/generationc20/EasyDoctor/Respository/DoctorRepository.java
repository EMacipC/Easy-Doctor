package com.generationc20.EasyDoctor.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	@Query(value="select*from doctor where nombre= ?",nativeQuery = true)
	List<Doctor> findByName(String nombre);

}
