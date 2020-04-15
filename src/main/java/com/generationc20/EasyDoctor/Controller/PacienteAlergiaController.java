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

import com.generationc20.EasyDoctor.Service.PacienteAlergiaService;
import com.generationc20.EasyDoctor.model.PacienteAlergia;

@RestController
@RequestMapping("/pA")
public class PacienteAlergiaController {
	@Autowired
	private PacienteAlergiaService servise;
	
	@CrossOrigin
	@PostMapping("/{idPaciente}/{idAlergia}")
	public ResponseEntity<PacienteAlergia> crear(@PathVariable("idPaciente")Integer idPaciente,@PathVariable("idAlergia")Integer idAlergia,
			@RequestBody PacienteAlergia pacienteAlergia){
		return new ResponseEntity<>(servise.crear(idPaciente, idAlergia, pacienteAlergia),HttpStatus.CREATED);
	}
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<PacienteAlergia>> getAll(){
		return new ResponseEntity<>(servise.getAll(),HttpStatus.OK);
	}

}
