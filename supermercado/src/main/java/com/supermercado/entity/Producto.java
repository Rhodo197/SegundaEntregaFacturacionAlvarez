package com.supermercado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre", unique = true)
	private String nombre;
	
	@Column (name="valor")
	private Long precio;
	
	@Column (name="tipo")
	private String tipo;

	public Long getId() {
		return id;
	}
	
	
	
	public Producto() {
		
	}
	
	

	public Producto(Long id, String nombre, Long precio, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + "]";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTip(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
