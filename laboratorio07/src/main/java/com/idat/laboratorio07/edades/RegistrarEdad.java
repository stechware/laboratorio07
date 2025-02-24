/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.edades;

/**
 *
 * @author IDAT
 */
public class RegistrarEdad {
    
    private int numeroPersonasMayoresEdad;
    private int numeroPersonasMenoresEdad;
    private int mayorEdadIngresada;
    private int menorEdadIngresada;

    public RegistrarEdad() {
        this.numeroPersonasMayoresEdad = 0;
        this.numeroPersonasMenoresEdad = 0;
        this.mayorEdadIngresada = 0;
        this.menorEdadIngresada = 120;
    }
    
    public void registrar(int edad){
        
        if(edad >= 18){
            numeroPersonasMayoresEdad ++;
        }else{
            numeroPersonasMenoresEdad ++;
        }
        
        if(edad > mayorEdadIngresada){
            mayorEdadIngresada = edad;
        }
        if(edad < menorEdadIngresada){
            menorEdadIngresada = edad;
        }
        System.out.println("===========================");
        System.out.println("Edad Ingresada :"+edad);
        reporte();        
    }
    
    public void reporte(){
        
        System.out.println("El número de personas mayores de edad : "+numeroPersonasMayoresEdad);
        System.out.println("El número de personas menores de edad : " +numeroPersonasMenoresEdad);
        System.out.println("La mayor edad ingresada               : "+mayorEdadIngresada);
        System.out.println("La menor edad ingresada               : "+menorEdadIngresada);
   
    }

    public int getNumeroPersonasMayoresEdad() {
        return numeroPersonasMayoresEdad;
    }

    public void setNumeroPersonasMayoresEdad(int numeroPersonasMayoresEdad) {
        this.numeroPersonasMayoresEdad = numeroPersonasMayoresEdad;
    }

    public int getNumeroPersonasMenoresEdad() {
        return numeroPersonasMenoresEdad;
    }

    public void setNumeroPersonasMenoresEdad(int numeroPersonasMenoresEdad) {
        this.numeroPersonasMenoresEdad = numeroPersonasMenoresEdad;
    }

    public int getMayorEdadIngresada() {
        return mayorEdadIngresada;
    }

    public void setMayorEdadIngresada(int mayorEdadIngresada) {
        this.mayorEdadIngresada = mayorEdadIngresada;
    }

    public int getMenorEdadIngresada() {
        return menorEdadIngresada;
    }

    public void setMenorEdadIngresada(int menorEdadIngresada) {
        this.menorEdadIngresada = menorEdadIngresada;
    }

   
    @Override
    public String toString() {
        return "RegistrarEdad{" + "numeroPersonasMayoresEdad=" + numeroPersonasMayoresEdad + ", numeroPersonasMenoresEdad=" + numeroPersonasMenoresEdad + ", mayorEdadIngresada=" + mayorEdadIngresada + ", menorEdadIngresada=" + menorEdadIngresada + '}';
    }
     
}
