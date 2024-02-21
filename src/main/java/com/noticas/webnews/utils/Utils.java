package com.noticas.webnews.utils;

import com.noticas.webnews.dto.ValidatePasswordDto;

public class Utils {

	public String clean(String cadena) 
	{
	    String abecedario = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-=[*<_.!¡@#$¿>%&]+/()?áéíóúàèìòùü,;";
	    String respuesta = "";
	    for (int i = 0; i < cadena.length(); i++) {
	        String caracter = cadena.charAt(i) + "";
	        if (abecedario.contains(caracter)) {
	            respuesta = respuesta + caracter;
	        }
	    }
	    return respuesta;
	}
	
	public ValidatePasswordDto validatedPassword(int length, int minNumber, int minLowercase, int minUppercase, int minCharacterEspecial, String password) 
	{
		ValidatePasswordDto validatePasswordDto = new ValidatePasswordDto();
		
		 String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
         String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String digitChars = "0123456789";
         String specialChars = "!@#$%^&*()_+[]{}|;':,.<>?";
         
         int validatedQuantity = 0;
         
         if(password.length() < length) 
         {
        	 validatePasswordDto.setMessage("La contraseña debe de tener un minimo de: " + String.valueOf(length) + " caracteres ");
        	 validatePasswordDto.setValid(false);
        	 return validatePasswordDto;
         }
         
         for (int i = 0; i < password.length(); i++) 
         {
 	        String caracter =  password.charAt(i) + "";
 	        if (digitChars.contains(caracter)) 
 	        {
 	            validatedQuantity++;
 	        }
 	    }
        
        if(validatedQuantity < minNumber)
        {
        	 validatePasswordDto.setMessage("La contraseña debe de tener un minimo de: " + String.valueOf(minNumber) + " numeros ");
        	 validatePasswordDto.setValid(false);
        	 return validatePasswordDto;
        }
        
        validatedQuantity = 0;
        
        for (int i = 0; i < password.length(); i++) 
        {
	        String caracter =  password.charAt(i) + "";
	        if (lowercaseChars.contains(caracter)) 
	        {
	            validatedQuantity++;
	        }
	    }
        
        if(validatedQuantity < minLowercase)
        {
        	 validatePasswordDto.setMessage("La contraseña debe de tener un minimo de: " + String.valueOf(minLowercase) + " caracteres minúsculas ");
        	 validatePasswordDto.setValid(false);
        	 return validatePasswordDto;
        }
        
        validatedQuantity = 0;
        
        for (int i = 0; i < password.length(); i++) 
        {
	        String caracter = password.charAt(i) + "";
	        if (uppercaseChars.contains(caracter)) 
	        {
	            validatedQuantity++;
	        }
	    }
        
        if(validatedQuantity < minUppercase)
        {
        	 validatePasswordDto.setMessage("La contraseña debe de tener un minimo de: " + String.valueOf(minUppercase) + " caracteres mayúsculas ");
        	 validatePasswordDto.setValid(false);
        	 return validatePasswordDto;
        }
        
        validatedQuantity = 0;
        
        for (int i = 0; i < password.length(); i++) 
        {
	        String caracter = password.charAt(i) + "";
	        if (specialChars.contains(caracter)) 
	        {
	            validatedQuantity++;
	        }
	    }
        
        if(validatedQuantity < minCharacterEspecial)
        {
        	 validatePasswordDto.setMessage("La contraseña debe de tener un minimo de: " + String.valueOf(minCharacterEspecial) + " caracteres especiales ");
        	 validatePasswordDto.setValid(false);
        	 return validatePasswordDto;
        }
        
        validatePasswordDto.setMessage("");
   	 	validatePasswordDto.setValid(true);
        return validatePasswordDto;
	}
	
	
}
