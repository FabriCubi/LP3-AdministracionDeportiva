package com.lp3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp3.modelo.Equipo;

@Repository
public interface EquipoDAO extends JpaRepository<Equipo,String> {
	public List<Equipo> findByEquipo(String equipo);
}
