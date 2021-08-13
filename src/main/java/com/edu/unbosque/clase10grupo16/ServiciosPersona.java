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
 * @author Usuario
 */
public class ServiciosPersona {

    List<Persona> lista;//TODO queda acá guardado (BD Imaginaria)

    ServiciosPersona() {
        this.lista = new ArrayList<Persona>();
    }

    public List<Persona> buscarTodos() {
        return lista;
    }

    public void LlenarLista(String nom, String ape, int edad) {

        Persona p = new Persona(nom, ape, edad);
        lista.add(p);//append en PYthon

    }

    public Persona buscarParticular(String ape) {
        Persona res = null;
        try {
            for (Persona p : lista) {
                if (p.getApellidos().equals(ape)) {
                    //System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());
                    res = p;
                }

            }
        } catch (Exception e) {
            System.out.println("Error al buscar: " + e.getMessage());

        } finally {
            if (res == null) {
                res = new Persona("No", "Está", 0);
            }

        }

        return res;
    }

    public void modificarPersona(String ape) {
        int pos = 0, C;
        String A, B;

        Scanner data = new Scanner(System.in);
        try {
            for (Persona p : lista) {

                if (p.getApellidos().equals(ape)) {

                    System.out.println("Digite Nombre:");
                    A = data.next();
                    System.out.println("Digite Apellido:");
                    B = data.next();
                    System.out.println("Digite Edad:");
                    C = data.nextInt();

                    Persona pNuevo = new Persona(A, B, C);
                    lista.set(pos, pNuevo);
                }
                pos++;

            }
            System.out.println("Se modificó la persona");
        } catch (Exception e) {
            System.out.println("Error al buscar: " + e.getMessage());

        }

    }

    public void borrarPersona(String ape) {
        try {
            for (Persona p : lista) {

                if (p.getApellidos().equals(ape)) {
                    lista.remove(p);
                }
            }
            System.out.println("Se eliminó la persona");
        } catch (Exception e) {
            System.out.println("Error al borrar:" + e.getMessage());
        }
    }

}
