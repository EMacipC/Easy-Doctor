package com.generationc20.EasyDoctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.HistorialClinicoService;
import com.generationc20.EasyDoctor.Service.HistorialFamiliarService;
import com.generationc20.EasyDoctor.Service.HistorialNoClinicoService;
import com.generationc20.EasyDoctor.Service.HistorialSexualService;
import com.generationc20.EasyDoctor.Service.PacienteService;
import com.generationc20.EasyDoctor.model.HistorialClinico;
import com.generationc20.EasyDoctor.model.HistorialFamiliar;
import com.generationc20.EasyDoctor.model.HistorialNoClinico;
import com.generationc20.EasyDoctor.model.HistorialSexual;
import com.generationc20.EasyDoctor.model.Paciente;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private PacienteService service;
	@Autowired
	private HistorialFamiliarService histoFService;
	@Autowired
	private HistorialClinicoService histoCService;
	@Autowired
	private HistorialNoClinicoService histoNCService;
	@Autowired
	private HistorialSexualService histSService;
	
	@GetMapping
	public ResponseEntity<List<Paciente>> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@PostMapping 
	public ResponseEntity<Paciente> crear(@RequestBody Paciente paciente){
		return new ResponseEntity<>(service.crearPaciente(paciente),HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Paciente> getById(@PathVariable("id") Integer id){
		return new ResponseEntity<>(service.getById(id).get(),HttpStatus.OK);
	}
	@PostMapping("/{id}/histoFam")
	public ResponseEntity<HistorialFamiliar> crearhf(@PathVariable("id")Integer id,@RequestBody HistorialFamiliar hF){
		return new ResponseEntity<>(histoFService .crear(id, hF),HttpStatus.CREATED);
	}
	@PostMapping("/{id}/histoClin")
	public ResponseEntity<HistorialClinico> crearhC(@PathVariable("id")Integer id,@RequestBody HistorialClinico hC){
		return new ResponseEntity<>(histoCService.crear(id, hC),HttpStatus.CREATED);
	}
	@PostMapping("/{id}/histoNoClin")
	public ResponseEntity<HistorialNoClinico> crearhNC(@PathVariable("id")Integer id,@RequestBody HistorialNoClinico hNC){
		return new ResponseEntity<>(histoNCService.cerar(id, hNC),HttpStatus.CREATED);
	}
	@PostMapping("/{id}/histoSex")
	public ResponseEntity<HistorialSexual> crearhS(@PathVariable("id")Integer id,@RequestBody HistorialSexual hS){
		return new ResponseEntity<>(histSService.crear(id, hS),HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Paciente> updata(@PathVariable("id")Integer id, @RequestBody Paciente paciente){
		return new ResponseEntity<>(service.updata(id, paciente),HttpStatus.OK);
	}
	@DeleteMapping
	public ResponseEntity<Void> delate(@PathVariable("id")Integer id){
		service.delate(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
