package com.nexsys.nexsys.controllers;

import com.nexsys.nexsys.entities.Producto;
import com.nexsys.nexsys.services.CategoriaService;
import com.nexsys.nexsys.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
@RestController
@RequestMapping("/nexsys/v1")
public class CategoriaControllers {

    @Autowired
    public CategoriaService categoriaService;

    public CategoriaControllers(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categorias")
    public List<Categoria> getAllCategorias(){
        return this.categoriaService.getAllCategoria();
    }

    @GetMapping("/categorias/{cid}")
    public Optional<Categoria> getCategoria(@PathVariable("cid") int cid){
        return this.categoriaService.getCategoria(cid);
    }

    @PostMapping("/categories/")
    public Categoria getAllCategories(@RequestBody Categoria categoria){
        return  this.categoriaService.getAllCategories(categoria);
    }

    @DeleteMapping("/eliminar/{cid}")
    public String eliminarCategoria(@PathVariable("cid") int cid) {
        this.categoriaService.eliminarCategoria(cid);
        return " Se ha eliminado la categoria correctamente ";
    }
}
