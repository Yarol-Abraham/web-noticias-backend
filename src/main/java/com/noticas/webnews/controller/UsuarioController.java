package com.noticas.webnews.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webnoticias")
//@CrossOrigin("http://localhost:3000")
public class UsuarioController {


	// 1.0 REGISTRAR USUARIO
	
	// 2.0 OBTENER MI USUARIO (AUTENTICADO)
	@GetMapping("/usuario")
	public String getAll()
	{
		return "Deberia de retonar mi usuario";
	}
	
	
}
