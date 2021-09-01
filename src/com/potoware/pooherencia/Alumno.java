package com.potoware.pooherencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMatematicas;
    private double notaEspaniol;
    private double notaHistoria;

    public Alumno() {
        super();
        System.out.println("Alumno inicializando constructor");
    }

     public Alumno(String nombre, String apellido){
        super(nombre, apellido);
     }

     public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
     }

     public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
     }

     public Alumno(String nombre, String apellido, int edad, String institucion, double notaEspaniol, double notaHistoria, double notaMatematicas){
        this(nombre, apellido, edad, institucion);
        this.notaEspaniol = notaEspaniol;
        this.notaHistoria = notaHistoria;
        this.notaMatematicas = notaMatematicas;
     }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaEspaniol() {
        return notaEspaniol;
    }

    public void setNotaEspaniol(double notaEspaniol) {
        this.notaEspaniol = notaEspaniol;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
