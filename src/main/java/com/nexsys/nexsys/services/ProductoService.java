package com.nexsys.nexsys.services;

import com.nexsys.nexsys.repository.ProductoRepository;
import com.nexsys.nexsys.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAllProduct(){
        return this.productoRepository.findAll();
    }

    public Optional<Producto> getProduct(int pid){
        return this.productoRepository.findById(pid);
    }

    public Producto createAProduct(Producto nuevoProducto){
        return this.productoRepository.save(nuevoProducto);
    }

    public void eliminarProducto(int pid){
        this.productoRepository.deleteById(pid);
    }

}
