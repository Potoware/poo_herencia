package com.potoware.ejemplo;

import com.potoware.pooherencia.Alumno;
import com.potoware.pooherencia.AlumnoInternacional;
import com.potoware.pooherencia.Persona;
import com.potoware.pooherencia.Profesor;


public class EjemploHerenciaToString {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("==========ALUMNO==============");
        Alumno alumno = new Alumno("Andres", "Garzon", 41, "Uninpahu");
        alumno.setNotaEspaniol(5.5);
        alumno.setNotaHistoria(5.2);
        alumno.setNotaMatematicas(2.1);
        alumno.setEmail("apotosi@asesoftware.com");

        System.out.println("==========ALUMNO INTERNACIONAL==============");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Parker", "Mexico");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Cambridge University");
        alumnoInternacional.setNotaIdiomas(5.0);
        alumnoInternacional.setNotaEspaniol(5.8);
        alumnoInternacional.setNotaMatematicas(5.3);
        alumnoInternacional.setNotaHistoria(5.4);
        alumnoInternacional.setEmail("apotosimo@uninpahu.edu.co");

        System.out.println("==========PROFESOR==============");
        Profesor profesor = new Profesor("Juan", "Castro", "Español");
        profesor.setEmail("Profesor@sena.edu.co");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("================SOBREESCRITURA=============================");
        System.out.println(persona.saludar());
        alumno.saludar();
        alumnoInternacional.saludar();
        profesor.saludar();
        System.out.println("=============================================");
        //System.out.println("Promedio " +((AlumnoInternacional)persona).calcularPromedio());
        imprimir(alumno);
        System.out.println("=============================================");
        imprimir(alumnoInternacional);
        System.out.println("=============================================");
        imprimir(profesor);
    }
    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}





