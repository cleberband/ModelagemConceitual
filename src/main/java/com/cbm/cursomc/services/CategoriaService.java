package com.cbm.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbm.cursomc.domain.Categoria;
import com.cbm.cursomc.repositories.CategoriaRepository;
import com.cbm.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado com o id: " + id +
							" Tipo: " + Categoria.class.getName()));
	}
}
