package com.potoware.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor() {
        System.out.println("Inicializando Constructor");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        this(nombre, apellido);
        this.asignatura = asignatura;
    }



    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Hola, soy un master gg, soy " +getNombre()+" dicto "+getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura + '\'' +
                '}';
    }
}
