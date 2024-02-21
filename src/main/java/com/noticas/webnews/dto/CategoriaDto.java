package com.noticas.webnews.dto;

public class CategoriaDto {

	private int IdCategoria;
	private String Nombre;
	
	public CategoriaDto(int idCategoria, String nombre) 
	{
		IdCategoria = idCategoria;
		Nombre = nombre;
	}

	public int getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
