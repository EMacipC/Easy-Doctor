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

import com.generationc20.EasyDoctor.Service.LaboratorioService;
import com.generationc20.EasyDoctor.model.Laboratorio;

public class LaboratorioController {
	@Autowired
	private LaboratorioService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Laboratorio>>getAll(){
		return  new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<Laboratorio> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<Laboratorio> updata(@PathVariable("id") Integer id,@RequestBody Laboratorio l){
		return new ResponseEntity<>(service.update(id, l),HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
