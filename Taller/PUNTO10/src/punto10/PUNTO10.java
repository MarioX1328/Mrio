/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class PUNTO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float kilogramos,gramos,toneladas,libras;
        
        System.out.println("Ingresa el peso en kilogramos: ");
        kilogramos=entrada.nextFloat();
        gramos= kilogramos*1000;
        toneladas= kilogramos/1000;
        libras= kilogramos*2205;
        
        System.out.println("Los kilogramos son: "+kilogramos);
        System.out.println("En gramos son: "+gramos);
        System.out.println("En toneladas son: "+toneladas);
        System.out.println("En libras son: "+libras);
        System.out.println("HECHO POR MARIO");
    }
    
}
