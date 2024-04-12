package com.supermercado.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supermercado.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

	
	
	Optional<Producto> encontrarProductoPorNombre(String nombre);
}
