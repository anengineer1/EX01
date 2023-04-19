package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Salas;
import com.example.demo.dto.Usuarios;
import com.example.demo.service.SalasServiceImpl;
import com.example.demo.service.UsuariosServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {
	
	@Autowired
	SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarAlmacenes(){
		return salasServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarAlmacenes(@RequestBody Salas departamento) {
		
		return salasServiceImpl.guardarSala(departamento);
	}
	
	@GetMapping("/salas/{id}")
	public Salas almacenXID(@PathVariable(name="id") long id) {
		
		Salas almacen_xid = new Salas();
		
		almacen_xid = salasServiceImpl.salaXID(id);
		
		System.out.println("Usuario XID: " + almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarAlmacen(@PathVariable(name="id")long id,@RequestBody Salas almacen) {
		
		Salas almacen_seleccionado= new Salas();
		Salas almacen_actualizado= new Salas();
		
		almacen_seleccionado= salasServiceImpl.salaXID(id);
		
		almacen_seleccionado.setNombre(almacen.getNombre());
		almacen_seleccionado.setJuego(almacen.getJuego());
		
		almacen_actualizado = salasServiceImpl.actualizarSala(almacen_seleccionado);
		
		System.out.println("El usuario actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eleiminarAlmacen(@PathVariable(name="id")long id) {
		salasServiceImpl.eliminarSala(id);
	}

}