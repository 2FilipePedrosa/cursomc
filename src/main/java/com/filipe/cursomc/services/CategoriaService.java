package com.filipe.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filipe.cursomc.domain.Categoria;
import com.filipe.cursomc.repositories.CategoriaRepository;
import com.filipe.cursomc.services.exceptions.ObjectNotFoundExceptions;



@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
 public Categoria buscar(Integer id) {
	 Optional <Categoria> obj = repo.findById(id);
	 return obj.orElseThrow(() -> new ObjectNotFoundExceptions("Objecto não encontrado! Id:"+ id + ", Tipo: "+ Categoria.class.getName()));
	  
 }
 
}
