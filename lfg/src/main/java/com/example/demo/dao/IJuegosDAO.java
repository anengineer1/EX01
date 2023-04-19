package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Juegos;

/**
 * @author Francisco
 *
 */
public interface IJuegosDAO extends JpaRepository<Juegos, Long>{

	// Minor test
	// public Empleados findByDNI(String dni);
	
}
