/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

/**
 *
 * @author andy2
 */
public class VerificarContrasenia {
    
    public static boolean verify(String password){
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero =    false;
        boolean caracter =  false;
        
        boolean verificado = false;
        
        for (char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                mayuscula = true;
            }
            if(Character.isLowerCase(c)){
                minuscula = true;
            }
            if(Character.isDigit(c)){
                numero = true;
            }
            if(!Character.isLetterOrDigit(c)){
                caracter = true;
            }
        }
        
        if(mayuscula && minuscula && numero && caracter){
            verificado = true;
        }
        
        return verificado;
    }
}
