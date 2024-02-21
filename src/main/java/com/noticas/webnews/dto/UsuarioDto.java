package com.noticas.webnews.dto;

public class UsuarioDto {
	
	private int IdUsuario;
	private String Nombre;
	private String Apellido;
	private String Usuario;
	private String Password;
	
	public UsuarioDto() {};
	
	public UsuarioDto(String nombre, String apellido, String usuario, String password) {
		Nombre = nombre;
		Apellido = apellido;
		Usuario = usuario;
		Password = password;
	}

	public int getIdUsuario()
	{
		return IdUsuario;
	}
	
	public void setIdUsuario(int IdUsuario)
	{
		this.IdUsuario = IdUsuario;
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
	
}
