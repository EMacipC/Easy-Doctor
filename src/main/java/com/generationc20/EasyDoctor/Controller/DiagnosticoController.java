package com.generationc20.EasyDoctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.generationc20.EasyDoctor.Service.DiagnosticoService;
import com.generationc20.EasyDoctor.model.Diagnostico;

public class DiagnosticoController {
	@Autowired
	private DiagnosticoService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Diagnostico>>getAll(){
		return  new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<Diagnostico> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<Diagnostico> updata(@PathVariable("id") Integer id,@RequestBody Diagnostico d){
		return new ResponseEntity<>(service.update(id, d),HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
