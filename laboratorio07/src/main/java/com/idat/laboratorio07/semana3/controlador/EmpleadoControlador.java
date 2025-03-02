/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.semana3.controlador;

import com.idat.laboratorio07.semana3.vista.EmpleadoVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import com.idat.laboratorio07.semana3.modelo.Empleado;

/**
 *
 * @author Solaris
 */
public class EmpleadoControlador {
    
    private EmpleadoVista vista;

    public EmpleadoControlador(EmpleadoVista vista) {
        this.vista = vista;

        // Agregar listeners a los botones
        vista.addProcesarListener(new ProcesarListener());
        vista.addBorrarListener(e -> vista.limpiarCampos());
        vista.addModificarListener(new ModificarListener());
    }

    class ProcesarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int codigo = Integer.parseInt(vista.getCodigo());
                String nombre = vista.getNombre();
                double horas = Double.parseDouble(vista.getHoras());

                Empleado emp = new Empleado(codigo, nombre, horas);
                vista.setResultado("Código: " + emp.getCod());
                vista.setResultado("Nombre: " + emp.getNom());
                vista.setResultado("Horas: " + emp.getHoras());
                vista.setResultado("Sueldo Bruto: " + emp.getSueldoBruto());
                vista.setResultado("Sueldo Neto: " + emp.getSueldoNeto());
                //vista.setResultado("Cantidad empleados: " + Empleado.getContador());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ingrese datos válidos.");
            }
        }
    }

    class ModificarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Nueva tarifa:", Empleado.getTarifa()));
            double pordscto = Double.parseDouble(JOptionPane.showInputDialog("Nuevo % descuento:", Empleado.getPorcentajeDescuento()));

            Empleado.setTarifa(tarifa);
            Empleado.setPorcentajeDescuento(pordscto);
        }
    }
}
