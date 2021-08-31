package com.potoware.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Alejandro");
        alumno.setApellido("Potosi");

        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Robenzo");
        profesor.setAsignatura("Ingles");

        System.out.println(alumno.getNombre()+" "+alumno.getApellido());
        System.out.println("Profesor: "+
                profesor.getNombre()+" "+profesor.getApellido()+
                " - Asignatura: "+profesor.getAsignatura());
    }
}
