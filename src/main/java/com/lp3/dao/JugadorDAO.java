package com.lp3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp3.modelo.Jugador;

@Repository
public interface JugadorDAO extends JpaRepository<Jugador,String>{
      List<Jugador> findByEquipo(String equipo);
      List<Jugador> findByPuesto(String puesto);
}
