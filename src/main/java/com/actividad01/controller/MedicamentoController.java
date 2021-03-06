package com.actividad01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 import com.actividad01.entity.Medicamento;
 import com.actividad01.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService service;
	
	
	/*Select*/
	@GetMapping	
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listarTodos(){
		List<Medicamento> lista =service.listaMedicamento();
		return ResponseEntity.ok(lista);
	}
	
	/*Update e Insert*/
	@PostMapping	
	@ResponseBody
	public ResponseEntity<Medicamento> inserta(@RequestBody Medicamento obj){
		Medicamento objSalida = service.insertaActualiza(obj);
		return ResponseEntity.ok(objSalida);
	}
}
