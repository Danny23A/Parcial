package com.parcial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Eps {

    public byte capacidad;
    private String nombre;
    private List<Paciente> pacientes;
    private List<Enfermedad> enfermedades;

    public Eps(){
        this.pacientes = new ArrayList<>();
    }

    public Eps(byte capacidad, String nombre){
        this.capacidad = 100;
        this.nombre = nombre;
    }


public boolean afiliarPaciente(long cedula, String nombre){

        Paciente pacienteAAfiliar = new Paciente(nombre, cedula);
        if ((this.pacientes.size() + 1) <= this.capacidad){
        this.pacientes.add(pacienteAAfiliar);
        } else {
        System.out.println("¡ERROR! Capacidad llena");
    }
        return true;
}

public void sacarPaciente(long cedula){
    Paciente pacienteASacar = buscarPaciente(cedula);
    if (pacienteASacar != null) {
        this.pacientes.remove(pacienteASacar);
        System.out.println("Se ha sacado el paciente " + pacienteASacar.getNombre());
    } else {
        System.out.println("¡ERROR!  el paciente no existe.");
    }

}

public Paciente buscarPaciente(long cedula){
        Paciente pacienteCedula = this.pacientes.stream()
           .filter(pacienteCed -> pacienteCed.getCedula().ecualsIgnorecase(cedula))
            .findFirst().orElse(null);
        if (pacienteCedula != null) {
        return pacienteCedula;
        } else {
        return null;
    }

}

public List<Paciente> buscarPacientesPorEnfermedad(String enfermedad){


        return null;
}

public List<Paciente> obtenerPacientesSinEnfermedades(){


        return null;
}

public void ordenarPacientesPorNombre (){

    this.pacientes.sort(Comparator.comparing(pacientes::getClass);

}
}