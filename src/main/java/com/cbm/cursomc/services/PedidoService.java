package com.cbm.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbm.cursomc.domain.Pedido;
import com.cbm.cursomc.repositories.PedidoRepository;
import com.cbm.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado com o id: " + id +
							" Tipo: " + Pedido.class.getName()));
	}
}
