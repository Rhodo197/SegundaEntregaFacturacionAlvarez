package com.supermercado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_operacion;
	@Column(name = "valor_total")
	private Long valor_total;
	public int getId_operacion() {
		return id_operacion;
	}
	public void setId_operacion(int id_operacion) {
		this.id_operacion = id_operacion;
	}
	public Long getValor_total() {
		return valor_total;
	}
	public void setValor_total(Long valor_total) {
		this.valor_total = valor_total;
	}
}
