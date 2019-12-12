package com.lp3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp3.modelo.Entrenador;

@Repository
public interface EntrenadorDAO extends JpaRepository<Entrenador,String>{

}
