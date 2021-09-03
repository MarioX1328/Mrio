/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso, altura,IMC;
        
        System.out.println("Ingresa tu altura en metros: ");
        altura=entrada.nextFloat();
        System.out.println("Ingresa tu peso en kiologramos: ");
        peso=entrada.nextFloat();
        
        IMC= peso/(altura*altura);
        
        System.out.println("Su indice de masa corporal es: "+IMC);
        System.out.println("HECHO POR MARIO");
        
    }
    
}
