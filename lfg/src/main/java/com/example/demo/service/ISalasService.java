package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Salas;

public interface ISalasService {

	// Metodos del CRUD
	public List<Salas> listarSalas(); // Listar All

	public Salas guardarSala(Salas fabricante); // CREATE

	public Salas salaXID(long id); // READ

	public Salas actualizarSala(Salas almacen); // UPDATE

	public void eliminarSala(long id);// DELETE

}