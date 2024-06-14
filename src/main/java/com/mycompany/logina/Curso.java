/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andy2
 */
public class Curso {

    public String idCurso;
    public String nombre;
    public String seccion;
    public Date fechaInicio;
    public Date fechaFin;
    public Date horaInicio;
    public Date horaFin;
    public String profesor;
    public ArrayList<Alumno> alumnos = new ArrayList<>();

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm");

    public String getIdCurso() {
        return idCurso;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaInicio() {
        return dateFormat.format(fechaInicio);
    }

    public String getFechaFin() {
        return dateFormat.format(fechaFin);
    }

    public String getHoraInicio() {
        return hourFormat.format(horaInicio);
    }

    public String getHoraFin() {
        return hourFormat.format(horaFin);
    }

    public String getProfesor() {
        return profesor;
    }

    public void setIdCurso(String idCurso) {
        if (idCurso == null || idCurso.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.idCurso = idCurso;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.nombre = nombre;
    }

    public void setProfesor(String profesor) {
        if (profesor == null || profesor.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.profesor = profesor;
    }

    public void setSeccion(String seccion) {
        if (seccion == null || seccion.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede ser nulo ni vacío");
        }
        this.seccion = seccion;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
