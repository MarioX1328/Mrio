/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        float precioC,precioV,ganancia;
        
        System.out.println("Ingresa el precio de compra: ");
        precioC=entrada.nextFloat();
        System.out.println("Ingresa el precio de venta: ");
        precioV=entrada.nextFloat();
        
        ganancia= precioV-precioC;
        System.out.println("Su ganancia es de :"+ganancia);
        System.out.println("HECHO POR MARIO");
        
    }
    
}
