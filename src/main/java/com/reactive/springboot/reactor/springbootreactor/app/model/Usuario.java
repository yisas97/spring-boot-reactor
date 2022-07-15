package com.reactive.springboot.reactor.springbootreactor.app.model;

import lombok.Data;

import java.io.Serializable;


public class Usuario implements Serializable {
	private static final long serialVersionUID = 2583072466961234383L;
	
	private String nombre;
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Usuario{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				'}';
	}
	
	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
}
