/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio07.edades;

import java.util.Scanner;

/**
 *
 * @author IDAT
 */
public class MainRegistrarEdad {
    
    
    public static void main(String[] args) {
       
        
        RegistrarEdad registrar = new RegistrarEdad();
        Scanner scanner = new Scanner(System.in);
        int edadIngresada;
        boolean bandera = true;
        
        
        //System.out.println(registrar);
        /*
        registrar.registrar(10);
        registrar.registrar(18);
        registrar.registrar(50);
        registrar.registrar(5);
        registrar.registrar(20);
        */
        
        do{
            System.out.println("Para Salir ingresar 0 :");
            System.out.println("Ingresar la edad : ");
            edadIngresada = scanner.nextInt();
            if (edadIngresada == 0){
                bandera =false;
                continue;
            }
            registrar.registrar(edadIngresada); 
            
        }while(bandera);
        
    }
    
}
