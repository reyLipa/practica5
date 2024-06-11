package com.educacionit;

public class Programador {
    private String nombre, apellido;


    public Programador() {
    }

    public Programador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    @Override
    public String toString() {
        return "Programador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }


    public static void validarNombreApellido(String nombre, String apellido) throws ValidadorNombreApellido {
if(!nombre.matches("[a-zA-Z]+")||!apellido.matches("[a-zA-Z]+")){
    System.out.println("datos ingresados");

    throw new ValidadorNombreApellido();
}

    }


        }



