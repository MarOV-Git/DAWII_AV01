package com.actividad01.service;

import java.util.List;
 
import com.actividad01.entity.Medicamento;

public interface MedicamentoService {
	public List<Medicamento> listaMedicamento();
	
	public Medicamento insertaActualiza(Medicamento obj);
}
