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
        this.menorEdadIngresada = 0;
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

    
/*
    @Override
    public String toString() {
        return "RegistrarEdad{" + "numeroPersonasMayoresEdad=" + numeroPersonasMayoresEdad + ", numeroPersonasMenoresEdad=" + numeroPersonasMenoresEdad + ", mayorEdadIngresada=" + mayorEdadIngresada + ", menorEdadIngresada=" + menorEdadIngresada + '}';
    }
 */    
}
