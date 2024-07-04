package com.mamglez.api.service;

import java.util.List;

import com.mamglez.api.entity.Album;

public interface IAlbumsService {
	
	List<Album> buscarTodos();
	
	void guardar(Album album);

}
