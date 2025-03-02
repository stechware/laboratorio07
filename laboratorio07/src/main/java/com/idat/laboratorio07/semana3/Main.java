/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.semana3;

import com.idat.laboratorio07.semana3.controlador.EmpleadoControlador;
import com.idat.laboratorio07.semana3.vista.EmpleadoVista;

/**
 *
 * @author Solaris
 */
public class Main {
    
    public static void main(String[] args) {
        EmpleadoVista vista = new EmpleadoVista();
        new EmpleadoControlador(vista);
        vista.setVisible(true);
    }
    
}
