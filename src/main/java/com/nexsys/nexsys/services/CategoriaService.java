package com.nexsys.nexsys.services;

import com.nexsys.nexsys.repository.CategoriaRepository;
import com.nexsys.nexsys.entities.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria getAllCategories(Categoria nuevaCategoria){
        return this.categoriaRepository.save(nuevaCategoria);
    }

}
