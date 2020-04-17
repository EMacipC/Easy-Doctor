package com.generationc20.EasyDoctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.CitaService;
import com.generationc20.EasyDoctor.model.Cita;

@RestController
@RequestMapping("/cita")
public class CitaController {
	
	@Autowired
	private CitaService service;
	
	@CrossOrigin
	@PostMapping("/{idPaciente}/{idDoctor}")
	public ResponseEntity<Cita> save(@RequestBody Cita cita,@PathVariable("idPaciente")Integer idPaciente,
			@PathVariable("idDoctor")Integer idDoctor){
		return new ResponseEntity<>(service.save(idPaciente,idDoctor,cita),HttpStatus.CREATED);
	}
	@CrossOrigin
	@GetMapping("/paciente/{fecha}/{idP}")
	public ResponseEntity<List<Cita>> getByFechaP(@PathVariable("fecha")String fecha,@PathVariable("idP")Integer idP){
		return new ResponseEntity<>(service.getByFechaP(fecha,idP),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/doctor/{fecha}/{idD}")
	public ResponseEntity<List<Cita>> getByFechaD(@PathVariable("fecha")String fecha,@PathVariable("idP")Integer idD){
		return new ResponseEntity<>(service.getByFechaD(fecha,idD),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/paciente/{idP}")
	public ResponseEntity<List<Cita>> getByPaciente(@PathVariable("idP")Integer idP){
		return new ResponseEntity<>(service.getByPaciente(idP),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/docotr/{idD}")
	public ResponseEntity<List<Cita>> getByDoctor(@PathVariable("idP")Integer idD){
		return new ResponseEntity<>(service.getByDoctor(idD),HttpStatus.OK);
	}
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<Cita> updata(@PathVariable("id")Integer id,@RequestBody Cita cita){
		return new ResponseEntity<>(service.updata(id, cita),HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<Cita> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<>(service.getById(id),HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delate(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
