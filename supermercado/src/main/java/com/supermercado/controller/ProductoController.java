package com.supermercado.controller;

import com.supermercado.services.ProductoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supermercado.entity.Producto;

@RestController
@RequestMapping(path= ("api/v1/productos"))
public class ProductoController {

	private final ProductoService productoService;
	
	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping
	public List<Producto> getProductos(){
		return this.productoService.getProducto();
	}
	
	
	@PostMapping
	public ResponseEntity<Object> registrarProducto(@RequestBody Producto producto) {
		return this.productoService.newProducto(producto);
	}
}
