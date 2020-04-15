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

import com.generationc20.EasyDoctor.Service.HistorialNoClinicoService;
import com.generationc20.EasyDoctor.model.HistorialNoClinico;

@RestController
@RequestMapping("/histoNoClin")
public class HistorialNoClinicoController {

	@Autowired
	private HistorialNoClinicoService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<HistorialNoClinico>> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<HistorialNoClinico> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<HistorialNoClinico> updata(@PathVariable("id")Integer id,@RequestBody HistorialNoClinico hNC){
		return new ResponseEntity<>(service.updata(id, hNC),HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
