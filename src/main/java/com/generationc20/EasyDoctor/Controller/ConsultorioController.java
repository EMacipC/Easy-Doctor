package com.generationc20.EasyDoctor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.ConsultorioService;
import com.generationc20.EasyDoctor.model.Consultorio;

@RestController
@RequestMapping("/consultorio")
public class ConsultorioController {

	@Autowired
	private ConsultorioService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Consultorio> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getByid(id).get(),HttpStatus.OK);
	}
}
