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

import com.generationc20.EasyDoctor.Service.ConsultorioSecretariaService;
import com.generationc20.EasyDoctor.Service.ConsultorioService;
import com.generationc20.EasyDoctor.Service.SecretariaService;
import com.generationc20.EasyDoctor.model.Consultorio;
import com.generationc20.EasyDoctor.model.ConsultorioDoctor;
import com.generationc20.EasyDoctor.model.ConsultorioSecretaria;
import com.generationc20.EasyDoctor.model.Secretaria;;


@RestController
@RequestMapping("/secretaria")
public class SecretariaController {
	@Autowired
	private SecretariaService service;
	@Autowired
	private ConsultorioService cService;
	@Autowired
	private ConsultorioSecretariaService cSService;
	
	@GetMapping
	public ResponseEntity<List<Secretaria>>getAll(){
		return  new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Secretaria>crear(@RequestBody Secretaria sec){
		return new ResponseEntity<>(service.crear(sec),HttpStatus.CREATED);
	}
	@PostMapping("/crearCons/{idCreador}")
	public ResponseEntity<Consultorio> crearCons(@PathVariable("idCreador")Integer idCreador,@RequestBody Consultorio cons){
		Consultorio consu=new Consultorio();
		consu=cService.crear(idCreador, cons);
		Integer idConsultorio=consu.getId();
		cSService.crearCS(idConsultorio, idCreador);
		return new ResponseEntity<>(consu,HttpStatus.CREATED);
	}
	@PostMapping("/inscribri")
	public ResponseEntity<ConsultorioSecretaria> inscribir(@RequestBody ConsultorioSecretaria consSecr){
		return new ResponseEntity<>(cSService.crear(consSecr),HttpStatus.CREATED);
	}
	@GetMapping("/{nombre}")
	public ResponseEntity<List<Secretaria>> getByName(@PathVariable("nombre")String nombre){
		return new ResponseEntity<>(service.getByName(nombre),HttpStatus.OK);
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
