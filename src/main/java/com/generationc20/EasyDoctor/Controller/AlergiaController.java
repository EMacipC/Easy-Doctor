package com.generationc20.EasyDoctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.AlergiaService;
import com.generationc20.EasyDoctor.model.Alergia;

@RestController
@RequestMapping("/alergia")
public class AlergiaController {
	
	@Autowired
	private AlergiaService service;
	
//	@CrossOrigin
//	@PostMapping("/{idPaciente}")
//	public ResponseEntity<Alergia> save(@PathVariable Integer idPaciente,@RequestBody Alergia alergia){
//		return new ResponseEntity<>(service.save(idPaciente,alergia),HttpStatus.CREATED);
//	}
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Alergia>> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}

}
