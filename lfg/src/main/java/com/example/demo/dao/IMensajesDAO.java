package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Mensajes;

/**
 * @author Francisco
 *
 */
public interface IMensajesDAO extends JpaRepository<Mensajes, Long>{

	// Minor test
	// public Empleados findByDNI(String dni);
	
}
