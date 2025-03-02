/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.semana3.vista;

import java.awt.Color;
import java.awt.Font;
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
public class EmpleadoVista extends JFrame {
    // Componentes de la interfaz
    private JLabel lblCodigo, lblNombre, lblHoras;
    private JTextField txtCodigo, txtNombre, txtHoras;
    private JButton btnProcesar, btnBorrar, btnModificar;
    private JTextArea txtS;
    private JScrollPane scpScroll;

    public EmpleadoVista() {
        setTitle("Gestión de Empleados");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(214, 211, 206));

        // Etiquetas
        lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(10, 10, 100, 20);
        getContentPane().add(lblCodigo);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 30, 100, 20);
        getContentPane().add(lblNombre);

        lblHoras = new JLabel("Horas:");
        lblHoras.setBounds(10, 50, 100, 20);
        getContentPane().add(lblHoras);

        // Campos de texto
        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 10, 100, 20);
        getContentPane().add(txtCodigo);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 30, 100, 20);
        getContentPane().add(txtNombre);

        txtHoras = new JTextField();
        txtHoras.setBounds(120, 50, 100, 20);
        getContentPane().add(txtHoras);

        // Botones
        btnProcesar = new JButton("Procesar");
        btnProcesar.setBounds(250, 10, 100, 20);
        getContentPane().add(btnProcesar);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(250, 30, 100, 20);
        getContentPane().add(btnBorrar);

        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(250, 50, 100, 20);
        getContentPane().add(btnModificar);

        // Área de texto con scroll
        txtS = new JTextArea();
        txtS.setFont(new Font("monospaced", Font.PLAIN, 12));
        scpScroll = new JScrollPane(txtS);
        scpScroll.setBounds(10, 90, 350, 240);
        getContentPane().add(scpScroll);
    }

    // Métodos para acceder a los componentes
    public String getCodigo() { return txtCodigo.getText(); }
    public String getNombre() { return txtNombre.getText(); }
    public String getHoras() { return txtHoras.getText(); }
    
    public void setResultado(String texto) { txtS.append(texto + "\n"); }
    public void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtHoras.setText("");
        txtS.setText("");
    }

    public void addProcesarListener(ActionListener listener) { btnProcesar.addActionListener(listener); }
    public void addBorrarListener(ActionListener listener) { btnBorrar.addActionListener(listener); }
    public void addModificarListener(ActionListener listener) { btnModificar.addActionListener(listener); }
}
