package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Salas;
import com.example.demo.dto.Usuarios;

/**
 * @author Francisco
 *
 */
public interface IUsuariosDAO extends JpaRepository<Usuarios, String>{

	List<Usuarios> findBySala(Salas sala);
}