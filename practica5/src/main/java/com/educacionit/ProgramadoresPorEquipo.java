package com.educacionit;

import java.util.ArrayList;
import java.util.List;

public class ProgramadoresPorEquipo extends Equipo implements EquipoMaxMin{

    private List<Programador> programadores;


    public ProgramadoresPorEquipo(String nombreEquipo, String universidad, String lenguajeProgramacion, int tamanioEquipo) {
        this.programadores = new ArrayList<>();
    }

    public ProgramadoresPorEquipo(String nombre, String universidad, String lenguaje, int tamanio, List<Programador> programadores) {
        super(nombre, universidad, lenguaje, tamanio);
        this.programadores = new ArrayList<>();
    }

    public void agregarProgramador(Programador programador) throws ExcepcionMaximo, ValidadorNombreApellido {
        if(programadores.size()>=MAXIMO){
            throw new ExcepcionMaximo("Equipo lleno");
        }
Programador.validarNombreApellido(programador.getNombre(),programador.getApellido());
        programadores.add(programador);
    }
public void listarProgramadores(){
    for (Programador p : programadores) {
        System.out.println(p);
    }
}

    @Override
    public boolean equipoCompleto() {
        if (programadores.size()>=MINIMO && programadores.size()<=MAXIMO){
            return true;
        }
        return false;
    }
}
