package com.mamglez.api.controller;

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

import com.mamglez.api.entity.Album;
import com.mamglez.api.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumsService serviceAlbum;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return serviceAlbum.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		serviceAlbum.guardar(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		serviceAlbum.guardar(album);
		return album;
	}
	
	@DeleteMapping("/albums/{id}")
	public String eliminar(@PathVariable("id") int idAlbum) {
		serviceAlbum.eliminar(idAlbum);
		return "Registro eliminado";
	}
	

}
