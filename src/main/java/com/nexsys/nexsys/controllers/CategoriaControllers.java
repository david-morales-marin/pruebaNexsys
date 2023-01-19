package com.nexsys.nexsys.controllers;

import com.nexsys.nexsys.services.CategoriaService;
import com.nexsys.nexsys.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RestController
@RequestMapping("/nexsys/v1")
public class CategoriaControllers {

    @Autowired
    public CategoriaService categoriaService;

    public CategoriaControllers(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @PostMapping("/categories/")
    public Categoria getAllCategories(@RequestBody Categoria categoria){
        return  this.categoriaService.getAllCategories(categoria);
    }

}
