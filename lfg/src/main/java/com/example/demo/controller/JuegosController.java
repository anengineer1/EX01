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
import com.example.demo.dto.Juegos;
import com.example.demo.service.JuegosServiceImpl;

@RestController
@RequestMapping("/api")
public class JuegosController {

	@Autowired
	JuegosServiceImpl CajasServiceImpl;
	
	@GetMapping("/juegos")
	public List<Juegos> listarVideos(){
		return CajasServiceImpl.listarJuegos();
	}
	
	@PostMapping("/juegos")
	public Juegos salvarArticulo(@RequestBody Juegos caja) {
		
		return CajasServiceImpl.guardarJuego(caja);
	}
	
	@GetMapping("/juegos/{id}")
	public Juegos articuloXID(@PathVariable(name="id") long id) {
		
		Juegos caja_xid= new Juegos();
		
		caja_xid=CajasServiceImpl.juegoXID(id);
		
		System.out.println("Video XID: "+caja_xid);
		
		return caja_xid;
	}

	@PutMapping("/juegos/{id}")
	public Juegos actualizarAlmacen(@PathVariable(name="id")long id,@RequestBody Juegos almacen) {
		
		Juegos almacen_seleccionado= new Juegos();
		Juegos almacen_actualizado= new Juegos();
		
		almacen_seleccionado= CajasServiceImpl.juegoXID(id);
		
		almacen_seleccionado.setNombre(almacen.getNombre());
		
		almacen_actualizado = CajasServiceImpl.actualizarJuego(almacen_seleccionado);
		
		System.out.println("El usuario actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/juegos/{id}")
	public void eleiminarAlmacen(@PathVariable(name="id")long id) {
		CajasServiceImpl.eliminarJuego(id);
	}

}