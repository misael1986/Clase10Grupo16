/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase10grupo16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * DTO - Data Tranfer Objects
 */
public class NewMain {

    public static void main(String[] args) {

        ArrayList<Integer> edades = new ArrayList();

        /*
   int -> Integer
   float -> Float
   double -> Double
   char -> Character -> String
   
         */
        edades.add(12);
        edades.add(25);
        edades.add(15);

        ServiciosPersona servicio = new ServiciosPersona();

        servicio.LlenarLista("Pedro", "Gomez", 65);
        servicio.LlenarLista("Clara", "Aguilar", 50);
        servicio.LlenarLista("Adriana", "Suarez", 35);
        servicio.LlenarLista("David", "Murcia", 40);

        List<Persona> personas = servicio.buscarTodos();

        for (Persona p : personas) {

            System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());

        }

        Persona buscada = servicio.buscarParticular("Murcia");
        System.out.println("Encontrado: " + buscada.getNombre() + " "
                + buscada.getApellidos() + " " + buscada.getEdad());

        servicio.modificarPersona("Murcia");
        servicio.borrarPersona("Gomez");

        List<Persona> personas2 = servicio.buscarTodos();

        for (Persona p : personas2) {

            System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());

        }

    }

    public void Menu() {
        Scanner opcion = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("INSTITUTO LA FLORESTA\n"
                    + "Seleccione tarea a realizar:\n"
                    + "1. Ingresar Persona\n"
                    + "2. Buscar Persona\n"
                    + "3. Modificar Persona\n"
                    + "4. Eliminar Persona\n"
                    + "5. Ver directorio de Persona\n"
                    + "6. Salir\n"
                    + "Opción:");
            op = opcion.nextInt();
            switch (op) {
                case 1:
                    break;
                default:
                    break;

            }

        } while (op != 6);
    }

}
