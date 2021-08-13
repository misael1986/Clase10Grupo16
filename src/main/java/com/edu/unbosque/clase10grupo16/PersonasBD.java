/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase10grupo16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PersonasBD {

    Connection conn;

    /**
     * Connect to a sample database
     */
    public void conectar() {
        this.conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/db/test.db";
            // create a connection to the database
            this.conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cerrar() {
        try {
            if (this.conn != null) {
                this.conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Persona> LeerPersonas() {
        List<Persona> listaPers = new ArrayList<Persona>();
        try {
            conectar();
            Statement stat = this.conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from personas;");
            while (rs.next()) {
                System.out.println("nombre = " + rs.getString("nombre"));
                System.out.println("apellido = " + rs.getString("apellido"));
                System.out.println("edad = " + rs.getString("edad"));
            }
        } catch (SQLException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        return listaPers;
    }

}
