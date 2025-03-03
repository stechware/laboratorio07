/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.arreglo_unidimensional;

import com.idat.laboratorio07.arreglo_unidimensional.controlador.ControladorArreglo;
import com.idat.laboratorio07.arreglo_unidimensional.modelo.ArregloUnidimensional;
import com.idat.laboratorio07.arreglo_unidimensional.vista.VistaArreglo;

/**
 *
 * @author Solaris
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArregloUnidimensional modelo = new ArregloUnidimensional();
        VistaArreglo vista = new VistaArreglo();
        new ControladorArreglo(modelo, vista);
        vista.setVisible(true);
        
    }
    
}
