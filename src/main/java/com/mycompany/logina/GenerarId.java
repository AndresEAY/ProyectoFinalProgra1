/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.util.Random;

/**
 *
 * @author andy2
 */
public class GenerarId {
    private static Integer idCurso = 1000;
    
    public static String generarCarnet(){
        Random random = new Random();
        String id = "3190-24-";
       
        for (int i = 0; i < 5; i++){
            int entero = random.nextInt(10);
            id = id + entero;
        }
        
        return id;
    }
    
    public static String generarId(){
        String id = "";
        idCurso++;
        
        id = id + idCurso;
        
        return id;
    }
}
