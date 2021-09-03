/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2,numero3,promedio,suma,producto,cociente,modulo;
        
        System.out.println("Ingresa tres numeros: ");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        numero3=entrada.nextFloat();
        
        suma= numero1+numero2+numero3;
        producto= numero1*numero2*numero3;
        promedio= suma/3;
        modulo=numero1%numero2%numero3;
        cociente= numero1/numero2/numero3;
        
        
        System.out.println("la suma es: "+suma);
        System.out.println("el producto es: "+producto);
        System.out.println("el promedio es: "+promedio);
        System.out.println("el modulo es: "+modulo);
        System.out.println("el cociente es: "+cociente);
        System.out.println("HECHO POR MARIO");
        
    }
    
}
