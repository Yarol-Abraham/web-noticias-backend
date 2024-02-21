package com.noticas.webnews.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class GenerateToken {

	public static SecretKey generateKey()
	{
		String ACCESO_TOKEN = "vo9ESA4xArHz0wW114MV";
		return Keys.hmacShaKeyFor(ACCESO_TOKEN.getBytes(StandardCharsets.UTF_8));
	}
	
	public String generateToken(String usuario)
	{
		long id = System.currentTimeMillis();
		
		String token = "";
		
		try {
			token = Jwts.builder()
					.signWith(generateKey(),SignatureAlgorithm.HS256)
					.setSubject(usuario)
					.setExpiration(new Date(id + (900000 * 4)))
					.setIssuedAt(new Date(id))
					.compact();
			
		}
		catch(Exception e)
		{
			System.out.println("Error, " + e.getMessage());
			token = "";
		}
		
		return token;
	}
	
}
