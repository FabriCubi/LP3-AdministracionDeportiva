package com.lp3.dao;

import org.springframework.stereotype.Repository;

import com.lp3.modelo.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonaDAO extends JpaRepository<Persona,String>{

}
