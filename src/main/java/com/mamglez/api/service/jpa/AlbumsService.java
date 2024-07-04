package com.mamglez.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mamglez.api.entity.Album;
import com.mamglez.api.repository.AlbumsRepository;
import com.mamglez.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {
	
	@Autowired
	private AlbumsRepository repoAlbums;

	@Override
	public List<Album> buscarTodos() {
		
		return repoAlbums.findAll();
	}

	@Override
	public void guardar(Album album) {
		repoAlbums.save(album);
		
	}

	@Override
	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
		
	}

}
