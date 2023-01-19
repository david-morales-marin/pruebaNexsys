package com.nexsys.nexsys.repository;

import com.nexsys.nexsys.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto , Integer>{
}
