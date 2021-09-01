package com.potoware.ejemplo;

import com.potoware.pooherencia.Alumno;
import com.potoware.pooherencia.AlumnoInternacional;
import com.potoware.pooherencia.Persona;
import com.potoware.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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
        System.out.println(imprimir(alumno));
        System.out.println(imprimir(alumnoInternacional));
        System.out.println(imprimir(profesor));
        System.out.println("================SOBREESCRITURA=============================");
        System.out.println(persona.saludar());
        alumno.saludar();
        alumnoInternacional.saludar();
        profesor.saludar();
        System.out.println("=============================================");
        //System.out.println("Promedio " +((AlumnoInternacional)persona).calcularPromedio());

    }

    public static boolean imprimir(Persona persona) {
        System.out.println("Imprimiendo datos Persona");
        System.out.println("Nombre: " + persona.getNombre() + " " +
                persona.getApellido() + " " +
                "Edad: " + persona.getEdad() + " " +
                "Email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo datos alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion() +
                    "Nota Matematicas: " + ((Alumno) persona).getNotaMatematicas()
                    + "Nota Español" + ((Alumno) persona).getNotaEspaniol()
                    + "Nota historia" + ((Alumno) persona).getNotaHistoria());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo datos alumno internacional");
                System.out.println("Nota idiomas:" + ((AlumnoInternacional) persona).getNotaIdiomas() +
                        "Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        return false;
    }
}

