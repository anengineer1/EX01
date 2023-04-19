package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IJuegosDAO;
import com.example.demo.dto.Juegos;
import com.example.demo.dto.Mensajes;

@Service
public class JuegosServiceImpl implements IJuegosService {

	@Autowired
	IJuegosDAO iCajasDAO;

	@Override
	public List<Juegos> listarJuegos() {

		return iCajasDAO.findAll();
	}

	@Override
	public Juegos guardarJuego(Juegos numreferencia) {

		return iCajasDAO.save(numreferencia);
	}

	@Override
	public Juegos juegoXID(long numreferencia) {

		return iCajasDAO.findById(numreferencia).get();
	}
	
	@Override
	public Juegos actualizarJuego(Juegos almacen) {
		
		return iCajasDAO.save(almacen);
	}

	@Override
	public void eliminarJuego(long id) {
		
		iCajasDAO.deleteById(id);
		
	}
}