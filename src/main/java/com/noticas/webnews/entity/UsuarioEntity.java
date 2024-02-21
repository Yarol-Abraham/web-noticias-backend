package com.noticas.webnews.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    private int IdUsuario;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Apellido")
	private String Apellido;
	
	@Column(name = "Usuario")
	private String Usuario;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "FechaCreacion")
	private Date FechaCreacion;
	
	@Column(name = "FechaActualizacion")
	private Date FechaActualizacion;

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Date getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion() {
		return FechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		FechaActualizacion = fechaActualizacion;
	}
	
}
