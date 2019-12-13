package com.lp3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp3.modelo.Torneo;

@Repository
public interface TorneoDAO extends JpaRepository<Torneo, String> {

}
