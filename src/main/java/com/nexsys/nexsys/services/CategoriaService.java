package com.nexsys.nexsys.services;

import com.nexsys.nexsys.entities.Producto;
import com.nexsys.nexsys.repository.CategoriaRepository;
import com.nexsys.nexsys.entities.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> getAllCategoria(){
        return this.categoriaRepository.findAll();
    }

    public Optional<Categoria> getCategoria(int cid){
        return this.categoriaRepository.findById(cid);
    }
    public Categoria getAllCategories(Categoria nuevaCategoria){
        return this.categoriaRepository.save(nuevaCategoria);
    }

    public void eliminarCategoria(int cid){
        this.categoriaRepository.deleteById(cid);
    }

}
