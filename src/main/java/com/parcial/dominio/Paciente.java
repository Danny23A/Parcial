package com.parcial.dominio;

import java.util.List;

public class Paciente {
    private long cedula;
    private String nombre;


    public Paciente(String nombre, long cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
