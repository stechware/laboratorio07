/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.arreglo_unidimensional.controlador;

import com.idat.laboratorio07.arreglo_unidimensional.modelo.ArregloUnidimensional;
import com.idat.laboratorio07.arreglo_unidimensional.vista.VistaArreglo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Solaris
 */
public class ControladorArreglo implements ActionListener{
    
    private ArregloUnidimensional modelo;
    private VistaArreglo vista;

    public ControladorArreglo(ArregloUnidimensional modelo, VistaArreglo vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }
    
    void imprimir(String mensaje) {
        
        vista.txtS.append(mensaje + "\n");
    }
    
    void mensaje(String cadena){
        JOptionPane.showMessageDialog(vista, cadena);
    }
    
    void reportar() {
    vista.txtS.setText("");
    if(modelo.getIndice()>0) {
        imprimir("Suma de edades: " + modelo.sumaEdades());
        imprimir("Edad menor: " + modelo.edadMenor());
        imprimir("Edad mayor: " + modelo.edadMayor());
        imprimir("Promedio de edades: " + modelo.edadPromedio());
    } else {
        mensaje("Arreglo vacío...");
    }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.btnIngresar) {
            int edad = Integer.parseInt(vista.txtEdad.getText());
            modelo.adicionar(edad);
            
        } else if (e.getSource() == vista.btnListar) {
            vista.txtS.setText("");
            for (int i = 0; i < modelo.getIndice(); i++) {
                vista.txtS.append("Edad[" + i + "] = " + modelo.obtener(i) + "\n");
            }
        } else if(e.getSource() == vista.btnBuscar){
        } else if(e.getSource() == vista.btnReportar){
            reportar();
        }
    }
    
    
}
