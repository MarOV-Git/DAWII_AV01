package com.actividad01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actividad01.entity.Medicamento;
import com.actividad01.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	private MedicamentoRepository repository;
	 
	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();

	}
	
	public Medicamento insertaActualiza(Medicamento obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

}
