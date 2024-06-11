package com.educacionit;

import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("***************DATOS DEL EQUIPO****************");
            System.out.println("Nombre del equipo:");
            String nombreEquipo = leer.nextLine();
            System.out.println("Universidad:");
            String universidad = leer.nextLine();
            System.out.println("Lenguaje de programación:");
            String lenguajeProgramacion = leer.nextLine();
            System.out.println("Ingrese el tamaño del equipo:");
            int tamanioEquipo = leer.nextInt();
            leer.nextLine();
            ProgramadoresPorEquipo equipo=new ProgramadoresPorEquipo(nombreEquipo,universidad,lenguajeProgramacion, tamanioEquipo);


            System.out.println("************** DATOS DEL PROGRAMADOR*************");

            for (int i = 0; i < tamanioEquipo; i++) {
                System.out.println("Programador "+(i+1));
                System.out.println("Nombre: ");
                String nombre = leer.nextLine();
                System.out.println("Apellido: " );
                String apellidos = leer.nextLine();

                Programador programador = new Programador(nombre, apellidos);
                equipo.agregarProgramador(programador);
            }
            System.out.println("*******Equipo******");
            System.out.println(equipo);
            System.out.println("********Lista de programadores:*******");
            equipo.listarProgramadores();

           leer.close();

        }catch (Exception e){
            System.out.println("error de dato ingresado "+e.getClass()+e.getMessage()+ e.getCause());
        }




    }
}
