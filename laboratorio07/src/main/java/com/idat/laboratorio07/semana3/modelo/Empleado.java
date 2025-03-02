/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.semana3.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Solaris
 */
public class Empleado {
    
    // Atributos privados
    private int cod;
    private String nom;
    private double horas;
    // Variables de clase o estáticas
    private static double tarifa;
    private static double porcentajeDescuento;
    
    // Inicializadores static
    static{
        tarifa = 40;
        porcentajeDescuento =11;
        mostrar("Llamada al inicializador 1");
    }

    public Empleado(int cod, String nom, double horas) {
        this.cod = cod;
        this.nom = nom;
        this.horas = horas;
        mostrar("Llamada al constructor");
    }
    
    public double getSueldoBruto(){
        
        return this.horas * tarifa;
        
    }
    
    public double getDescuentoSueldoBruto(){
        
        return getSueldoBruto() * (porcentajeDescuento/100);
    }
    
    public double getSueldoNeto(){
    
        return getSueldoBruto() -  getDescuentoSueldoBruto();
    }
    
    public static void mostrar(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public static double getTarifa() {
        return tarifa;
    }

    public static void setTarifa(double tarifa) {
        Empleado.tarifa = tarifa;
    }

    public static double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public static void setPorcentajeDescuento(double porcentajeDescuento) {
        Empleado.porcentajeDescuento = porcentajeDescuento;
    }
    
}
