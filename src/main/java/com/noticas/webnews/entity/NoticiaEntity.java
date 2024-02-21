package com.noticas.webnews.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NoticiaEntity {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdNoticia")
    private int IdNoticia;
	
	@Column(name = "Titulo")
	private String Titulo;
	
	@Column(name = "Imagen")
	private String Imagen;
	
	@Column(name = "Descripcion")
	private String Descripcion;
	
	@Column(name = "IdUsuario")
	private String IdUsuario;
	
	@Column(name = "IdCategoria")
	private String IdCategoria;
	
	@Column(name = "FechaCreacion")
	private String FechaCreacion;
	
	@Column(name = "FechaActualizacion")
	private String FechaActualizacion;

	public int getIdNoticia() {
		return IdNoticia;
	}

	public void setIdNoticia(int idNoticia) {
		IdNoticia = idNoticia;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
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

	public String getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public String getFechaActualizacion() {
		return FechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		FechaActualizacion = fechaActualizacion;
	}
	
}
