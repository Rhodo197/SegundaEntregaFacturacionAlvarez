package com.supermercado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Cliente {

	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int dni;
	@Column (name= "nombre")
	private String nombre;
	@Column(name= "apellido")
	private String apellido;
	
	@Column(name = "Sociedad")
	private Boolean Sociedad;

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Boolean getSociedad() {
		return Sociedad;
	}

	public void setSociedad(Boolean sociedad) {
		Sociedad = sociedad;
	}
	
	
	
	
}
