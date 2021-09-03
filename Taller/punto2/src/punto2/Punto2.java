/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;

public class Punto2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2,suma,producto,diferencia;
        
        System.out.println("Ingresa dos numeros: ");
        numero1=entrada.nextInt();
        numero2=entrada.nextInt();
        
        suma= numero1+numero2;
        producto= numero1*numero2;
        diferencia= numero1-numero2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("El producto es: "+producto);
        System.out.println("La diferencia de los numeros es: "+diferencia);
        System.out.println("HECHO POR MARIO");
        
        // TODO code application logic here
    }
    
}
