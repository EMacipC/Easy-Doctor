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

import com.generationc20.EasyDoctor.Service.HistorialClinicoService;
import com.generationc20.EasyDoctor.model.HistorialClinico;

@RestController
@RequestMapping("/histoClin")
public class HistorialClinicoController {
	
	@Autowired
	private HistorialClinicoService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<HistorialClinico>> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<HistorialClinico> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<HistorialClinico> updata(@PathVariable("id")Integer id,@RequestBody HistorialClinico hC){
		return new ResponseEntity<>(service.updata(id, hC),HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
		service.delate(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	

}
