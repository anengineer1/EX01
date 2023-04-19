package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Mensajes;
import com.example.demo.dto.Salas;

/**
 * @author Francisco
 *
 */
public interface IMensajesDAO extends JpaRepository<Mensajes, Long>{

	public List<Mensajes> findBySala(Salas sala);

}
