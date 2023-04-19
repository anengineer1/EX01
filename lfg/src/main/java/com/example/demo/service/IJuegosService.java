package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Juegos;
import com.example.demo.dto.Mensajes;

public interface IJuegosService {

	// Metodos del CRUD
	public List<Juegos> listarJuegos(); // Listar All

	public Juegos guardarJuego(Juegos caja); // CREATE

	public Juegos juegoXID(long numreferencia); // READ
	
	public Juegos actualizarJuego(Juegos almacen); // UPDATE

	public void eliminarJuego(long id);// DELETE
}