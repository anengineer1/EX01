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
	
	@GetMapping("/Juegos")
	public List<Juegos> listarVideos(){
		return CajasServiceImpl.listarJuegos();
	}
	
	@PostMapping("/Juegos")
	public Juegos salvarArticulo(@RequestBody Juegos caja) {
		
		return CajasServiceImpl.guardarJuego(caja);
	}
	
	@GetMapping("/Juegos/{id}")
	public Juegos articuloXID(@PathVariable(name="id") long id) {
		
		Juegos caja_xid= new Juegos();
		
		caja_xid=CajasServiceImpl.juegoXID(id);
		
		System.out.println("Video XID: "+caja_xid);
		
		return caja_xid;
	}

}