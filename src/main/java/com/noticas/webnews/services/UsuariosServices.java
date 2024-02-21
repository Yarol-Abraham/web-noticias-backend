package com.noticas.webnews.services;

import com.noticas.webnews.dto.ResponseRegisterDto;
import com.noticas.webnews.dto.UsuarioDto;

public interface UsuariosServices {

		public ResponseRegisterDto RegistrarUsuario(UsuarioDto usuarioDto);
	
		public ResponseRegisterDto ObtenerInformacion(String sessionId);
		
}
