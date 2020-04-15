package com.generationc20.EasyDoctor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.MedicamentoService;
import com.generationc20.EasyDoctor.model.Medicamento;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService service;
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<Medicamento> save(@RequestBody Medicamento medicamento){
		return new ResponseEntity<>(service.save(medicamento),HttpStatus.CREATED);
	}
	@CrossOrigin
	@GetMapping("/nombre/{nombre}")
	public ResponseEntity<Medicamento> getByName(@PathVariable("nombre")String nombre){
		return new ResponseEntity<>(service.getByName(nombre),HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
