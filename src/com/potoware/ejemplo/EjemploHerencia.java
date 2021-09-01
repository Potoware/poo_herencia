package com.potoware.ejemplo;
import com.potoware.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("==========ALUMNO==============");
        Alumno alumno = new Alumno();
        alumno.setNombre("Alejandro");
        alumno.setApellido("Potosi");
        alumno.setInstitucion("Uninpahu");
        alumno.setNotaEspaniol(5.5);
        alumno.setNotaHistoria(5.2);
        alumno.setNotaMatematicas(2.1);

        System.out.println("==========ALUMNO INTERNACIONAL==============");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Parker");
        alumnoInternacional.setPais("Mexico");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Cambridge University");
        alumnoInternacional.setNotaIdiomas(5.0);
        alumnoInternacional.setNotaEspaniol(5.8);
        alumnoInternacional.setNotaMatematicas(5.3);
        alumnoInternacional.setNotaHistoria(5.4);

        System.out.println("==========PROFESOR==============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Robenzo");
        profesor.setAsignatura("Ingles");

        System.out.println(alumno.getNombre()+" "+alumno.getApellido());
        System.out.println("Profesor: "+
                profesor.getNombre()+" "+profesor.getApellido()+
                " - Asignatura: "+profesor.getAsignatura());

        System.out.println("alumno = " + ((Alumno) alumno).getInstitucion());

        System.out.println("============================");
        System.out.println(alumnoInternacional.getNombre()+" "+alumnoInternacional.getApellido());
        System.out.println("Pais = " + alumnoInternacional.getPais());
        Class clase = alumnoInternacional.getClass();
        while (clase.getSuperclass()!= null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es clase hija de la clase padre "+padre);
            clase = clase.getSuperclass();
        }
    }
}
