package com.noticas.webnews.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.noticas.webnews.dto.ResponseRegisterDto;
import com.noticas.webnews.dto.UsuarioDto;
import com.noticas.webnews.entity.UsuarioEntity;
import com.noticas.webnews.repository.UsuarioRepository;
import com.noticas.webnews.security.PasswordEncrypt;
import com.noticas.webnews.utils.Utils;

public class UsuariosServiceImpl implements UsuariosServices {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private ResponseRegisterDto responseRegisterDto = new ResponseRegisterDto();
	private PasswordEncrypt passwordEncrypt = new PasswordEncrypt();
	
	private Utils utils = new Utils();
	
	// 1.0 Register
	@Override
	public ResponseRegisterDto RegistrarUsuario(UsuarioDto usuarioDto)
	{
		try{
			UsuarioEntity usuarioEntity = new UsuarioEntity();
			
			// 1.0 validar campos
			if(usuarioDto.getNombre().equals(""))
			{
				responseRegisterDto.setSuccess(false);
				responseRegisterDto.setMessage("El campo Nombre es obligatorio");
				responseRegisterDto.setUsuario(null);
				return responseRegisterDto;
			}
			
			if(usuarioDto.getApellido().equals(""))
			{
				responseRegisterDto.setSuccess(false);
				responseRegisterDto.setMessage("El campo Apellido es obligatorio");
				responseRegisterDto.setUsuario(null);
				return responseRegisterDto;
			}
			
			if(usuarioDto.getUsuario().equals(""))
			{
				responseRegisterDto.setSuccess(false);
				responseRegisterDto.setMessage("El campo Usuario es obligatorio");
				responseRegisterDto.setUsuario(null);
				return responseRegisterDto;
			}
			
			if(usuarioDto.getPassword().equals(""))
			{
				responseRegisterDto.setSuccess(false);
				responseRegisterDto.setMessage("El campo Contraseña es obligatorio");
				responseRegisterDto.setUsuario(null);
				return responseRegisterDto;
			}
			
			// 2.0 validar que el usuario no exista
			Optional<UsuarioEntity> existeUsuario = this.usuarioRepository.findByUsuario(usuarioDto.getUsuario());
			
			if(existeUsuario.isEmpty())
			{
				responseRegisterDto.setSuccess(false);
				responseRegisterDto.setMessage("El usuario ya esta registrado");
				responseRegisterDto.setUsuario(null);
				return responseRegisterDto;
			}
			
			// 3.0 en caso de que todo estuviera bien retornar el usuario creado
			usuarioEntity.setNombre(utils.clean(usuarioDto.getNombre()));
			usuarioEntity.setApellido( utils.clean((usuarioDto.getApellido())));
			usuarioEntity.setUsuario(utils.clean(usuarioDto.getUsuario()));
			
			usuarioEntity.setPassword(passwordEncrypt.EncriptarPassowrd(usuarioDto.getPassword()));
			
			responseRegisterDto.setMessage("Usuario Registrado");
			responseRegisterDto.setSuccess(false);
			responseRegisterDto.setUsuario(usuarioDto);
			
		}
		catch(Exception e)
		{
			responseRegisterDto.setSuccess(false);
			responseRegisterDto.setMessage("Ha ocurrido un error inesperado al crear el usuario");
			responseRegisterDto.setUsuario(null);
		}
		
		return responseRegisterDto;
	}


	
	@Override
	public ResponseRegisterDto ObtenerInformacion(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
