package com.lp3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp3.modelo.Empleado;

@Repository
public interface EmpleadoDAO extends JpaRepository<Empleado, String>{
	
	List<Empleado> findByCargo(String cargo);

}
