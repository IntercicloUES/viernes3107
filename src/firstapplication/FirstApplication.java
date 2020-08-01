/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplication;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class FirstApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primeraNota, segundaNota, terceraNota, cuartaNota, suma = 0, promedio;
        double convertir;
        
        Scanner ingresa = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese una nota");
        String nota1 = ingresa.nextLine();  // Read user input
        
        System.out.println("Ingrese otra nota");
        String nota2 = ingresa.nextLine();  // Read user input
        
        primeraNota = Integer.parseInt(nota1);
        segundaNota = Integer.parseInt(nota2);
        convertir = Double.parseDouble(nota1);
        
        suma = primeraNota + segundaNota;
        
        
        //Jerarquía de operaciones:
        // 1. () 2. * y/o / 3. + y/0 -
        
        
        System.out.println("Tu promedio de notas es: " + suma);
        
    }
    
}
