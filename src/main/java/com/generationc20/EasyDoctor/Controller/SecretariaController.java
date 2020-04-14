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
import com.generationc20.EasyDoctor.Service.SecretariaService;

import com.generationc20.EasyDoctor.model.Secretaria;;


@RestController
@RequestMapping("/secretaria")
public class SecretariaController {
	@Autowired
	private SecretariaService service;
	
	@GetMapping
	public ResponseEntity<List<Secretaria>>getAll(){
		return  new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Secretaria> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Secretaria> updata(@PathVariable("id") Integer id,@RequestBody Secretaria s){
		return new ResponseEntity<>(service.update(id, s),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
