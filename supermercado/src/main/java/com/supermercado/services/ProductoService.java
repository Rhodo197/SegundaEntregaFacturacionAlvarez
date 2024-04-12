package com.supermercado.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.supermercado.entity.Producto;
import com.supermercado.repository.ProductoRepository;

@Service
public class ProductoService {

	private final ProductoRepository productoRepository;
	
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	public List<Producto> getProducto(){
		return this.productoRepository.findAll();
		
	}
	public ResponseEntity<Object> newProducto(Producto producto) {
		
		Optional<Producto> respuesta = productoRepository.encontrarProductoPorNombre(producto.getNombre());
		HashMap<String, Object> datos = new HashMap<>();
		if (respuesta.isPresent()) { //si ya existe el producto
			datos.put("error", true);
			datos.put("Mensaje:", "Ya existe un producto con ese nombre");
			return new ResponseEntity<>(HttpStatus.CONFLICT);	
	}
		productoRepository.save(producto);  //si todavia no existe el producto
		datos.put("data", producto);
		datos.put("Mensaje:", "Se ha guardado con exito");
		return new ResponseEntity<>(producto, HttpStatus.CREATED);
		
	}
	
	
}
