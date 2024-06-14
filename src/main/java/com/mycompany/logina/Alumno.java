/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andres
 */
public class Alumno {
    public String carnet;
    public String nombre;
    public String apellido;
    public String password;
    public ArrayList<Curso> cursos = new ArrayList<>();
    public Map<String, Integer> nota = new HashMap<>();

    public Map<String, Integer> getNota() {
        return nota;
    }

    public void setNota(Map<String, Integer> nota) {
        this.nota = nota;
    }

    
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
