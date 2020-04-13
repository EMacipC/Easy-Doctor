package com.generationc20.EasyDoctor.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.DoctorService;
import com.generationc20.EasyDoctor.model.Doctor;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService service;
	
	@GetMapping
	public ResponseEntity<List<Doctor>>getAll(){
		return  new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Doctor> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Doctor> updata(@PathVariable("id") Integer id,@RequestBody Doctor d){
		return new ResponseEntity<>(service.update(id, d),HttpStatus.OK);
	}
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
