package com.educacionit;

public abstract class Equipo {
    protected String nombre, universidad, lenguaje;

    protected int tamanio;

    public Equipo() {
    }

    public Equipo(String nombre, String universidad, String lenguaje, int tamanio) {
        this.nombre = nombre;
        this.universidad = universidad;
        this.lenguaje = lenguaje;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }


    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", universidad='" + universidad + '\'' +
                ", lenguaje='" + lenguaje + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
