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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.HistorialFamiliarService;
import com.generationc20.EasyDoctor.model.HistorialFamiliar;

@RestController
@RequestMapping("/HistoFam")
public class HistorialFamiliarController {

	@Autowired
	private HistorialFamiliarService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<HistorialFamiliar>> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<HistorialFamiliar> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<HistorialFamiliar> updata(@PathVariable("id") Integer id,@RequestBody HistorialFamiliar hF){
		return new ResponseEntity<>(service.update(id, hF),HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping
	public ResponseEntity<Void> delate(@PathVariable("id")Integer id){
		service.delate(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}

