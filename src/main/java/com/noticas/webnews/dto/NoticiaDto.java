package com.noticas.webnews.dto;

public class NoticiaDto {

	private int IdNoticia;
	private String Imagen;
	private String Descripcion;
	private int IdCategoria;
	private int IdUsuario;
	
	public NoticiaDto(String imagen, String descripcion, int idCategoria, int idUsuario) {
		Imagen = imagen;
		Descripcion = descripcion;
		IdCategoria = idCategoria;
		IdUsuario = idUsuario;
	}

	public int getIdNoticia() {
		return IdNoticia;
	}

	public void setIdNoticia(int idNoticia) {
		IdNoticia = idNoticia;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	
	
	
}
