package com.noticas.webnews.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncrypt {

	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public String EncriptarPassowrd(String password)
	{
		String hash = passwordEncoder.encode(password);
		return hash;
	}
	
	public boolean CompararPassword(String passwordBD, String passwordField)
	{
		return passwordEncoder.matches(passwordField, passwordBD);
	}
}
