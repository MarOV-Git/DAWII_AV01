package com.actividad01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.actividad01.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{

}
