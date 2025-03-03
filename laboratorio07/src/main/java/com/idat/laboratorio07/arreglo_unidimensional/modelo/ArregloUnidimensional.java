/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.arreglo_unidimensional.modelo;

/**
 *
 * @author Solaris
 */
public class ArregloUnidimensional {
    
    private int edades[];
    private int indice;

    public ArregloUnidimensional() {
        this.edades = new int [10];
        this.indice = 0;
    }
    
    public void adicionar(int edad) {
        if (indice < edades.length) {
            edades[indice++] = edad;
        }
    }
    
    public int longTotal() { return edades.length; }
    public int obtener(int pos) { return edades[pos]; }
    public void reinicializar() { edades = new int[10]; indice = 0; }
    
        public void generar() {
        for (int i = 0; i < longTotal(); i++) {
            edades[i] = aleatorio(10, 99);
        }
        indice = longTotal();
    }
    
    public int buscar(int edad) {
        for (int i = 0; i < indice; i++) {
            if (edad == edades[i]) return i;
        }
        return -1;
    }
    
    public int sumaEdades() {
        int suma = 0;
        for (int i = 0; i < indice; i++) {
            suma += edades[i];
        }
        return suma;
    }
    
    public int edadMenor() {
        int min = edades[0];
        for (int i = 1; i < indice; i++) {
            if (edades[i] < min) min = edades[i];
        }
        return min;
    }
    
    public int edadMayor() {
        int max = edades[0];
        for (int i = 1; i < indice; i++) {
            if (edades[i] > max) max = edades[i];
        }
        return max;
    }
    
    public double edadPromedio() {
        return indice > 0 ? (double) sumaEdades() / indice : 0;
    }
    
    private int aleatorio(int min, int max) {
        return (int) ((max - min + 1) * Math.random() + min);
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    } 
}
