package com.nexsys.nexsys.repository;

import com.nexsys.nexsys.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria , Integer> {
}
