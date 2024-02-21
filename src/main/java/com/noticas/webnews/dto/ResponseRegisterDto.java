package com.noticas.webnews.dto;

public class ResponseRegisterDto {

	
	
	private String message = "";
	private boolean success = false;
	private UsuarioDto usuario = new UsuarioDto();

	public ResponseRegisterDto(){}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public UsuarioDto getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}
	
	
}
