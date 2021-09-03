/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        char caracter;
        
        System.out.println("Ingresa el caracter: ");
        caracter=entrada.next().charAt(0);
        
        int myInt = caracter - '0';
        
        System.out.println("Su valor es: "+myInt);
        System.out.println("HECHO POR MARIO");
        
        
        
    }
    
}
