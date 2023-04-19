package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalasDAO;
import com.example.demo.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService {
	
	@Autowired
	ISalasDAO iSalasDAO;
	
	@Override
	public List<Salas> listarSalas() {
		
		return iSalasDAO.findAll();
	}

	@Override
	public Salas guardarSala(Salas almacen) {
		
		return iSalasDAO.save(almacen);
	}

	@Override
	public Salas salaXID(long id) {
		
		return iSalasDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSala(Salas almacen) {
		
		return iSalasDAO.save(almacen);
	}

	@Override
	public void eliminarSala(long id) {
		
		iSalasDAO.deleteById(id);
		
	}

}