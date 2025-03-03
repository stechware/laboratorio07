/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.arreglo_unidimensional.vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Solaris
 */
public class VistaArreglo extends JFrame {
    
    public JTextField txtEdad;
    public JButton btnIngresar, btnListar, btnReportar, btnReinicializar, btnGenerar, btnBuscar;
    public JTextArea txtS;
    
    public VistaArreglo() {
        setTitle("Arreglo Unidimensional");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(40, 20, 100, 25);
        add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(120, 20, 80, 25);
        add(txtEdad);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(320, 80, 150, 23);
        add(btnIngresar);

        btnListar = new JButton("Listar");
        btnListar.setBounds(320, 105, 150, 23);
        add(btnListar);

        btnReportar = new JButton("Reportar");
        btnReportar.setBounds(320, 130, 150, 23);
        add(btnReportar);

        btnReinicializar = new JButton("Reinicializar");
        btnReinicializar.setBounds(320, 155, 150, 23);
        add(btnReinicializar);

        btnGenerar = new JButton("Generar");
        btnGenerar.setBounds(320, 180, 150, 23);
        add(btnGenerar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(320, 205, 150, 23);
        add(btnBuscar);

        txtS = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(txtS);
        scrollPane.setBounds(10, 80, 300, 250);
        add(scrollPane);
    }

    public void setControlador(ActionListener controlador) {
        btnIngresar.addActionListener(controlador);
        btnListar.addActionListener(controlador);
        btnReportar.addActionListener(controlador);
        btnReinicializar.addActionListener(controlador);
        btnGenerar.addActionListener(controlador);
        btnBuscar.addActionListener(controlador);
    }
    
}
