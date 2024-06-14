/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Profesor {
    public String nombre;
    public String apellido;
    public String usuario;
    public String password;
    public String especidalidad;
    public ArrayList<Curso> cursos = new ArrayList<>();

    public String getEspecidalidad() {
        return especidalidad;
    }

    public void setEspecidalidad(String especidalidad) {
        this.especidalidad = especidalidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        if (usuario == null || usuario.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.password = password;
    }
    
    
}
