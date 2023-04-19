package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Usuarios;

/**
 * @author Francisco
 *
 */
public interface IUsuariosDAO extends JpaRepository<Usuarios, String>{

}
