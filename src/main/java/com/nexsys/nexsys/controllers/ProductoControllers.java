package com.nexsys.nexsys.controllers;

import com.nexsys.nexsys.services.ProductoService;
import com.nexsys.nexsys.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Service
@RestController
@RequestMapping("/nexsys/v1")
public class ProductoControllers {

    @Autowired
    public ProductoService productoService;

    public ProductoControllers (ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping("/products")
    public List<Producto> getAllProducts(){
        return this.productoService.getAllProduct();
    }

    @GetMapping("/products/{pid}")
    public Optional<Producto> getProduct(@PathVariable("pid") int pid){
        return this.productoService.getProduct(pid);
    }

    @PostMapping("/products/")
    public Producto createAProduct(@RequestBody Producto producto){
        return this.productoService.createAProduct(producto);
    }

    @DeleteMapping("/eliminar/{pid}")
    public String eliminarProducto(@PathVariable("pid") int pid){
        this.productoService.eliminarProducto(pid);
        return " Se ha eliminado un registro ";
    }

}