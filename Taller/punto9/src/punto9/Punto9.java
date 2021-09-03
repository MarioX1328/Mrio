/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto9;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class Punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        float precioGasolina,kmgaso,estacionamiento,peajes,precio1,precio2,precio3;
        int dia,km;
        
        System.out.println("Cuantos dias tendra el viaje?: ");
        dia=entrada.nextInt();
        System.out.println("Cuantos kilometros conducira por dia?: ");
        km=entrada.nextInt();
        System.out.println("Cual es el costo del litro de gasolina?: ");
        precioGasolina=entrada.nextFloat();
        System.out.println("Cuantos kilometros recorres con un litro de gasolina?: ");
        kmgaso=entrada.nextFloat();
        System.out.println("Pago del estacionamiento por dia: ");
        estacionamiento=entrada.nextFloat();
        System.out.println("Pago de peajes por dia: ");
        peajes=entrada.nextFloat();
        
        precio1=estacionamiento+peajes*dia;
        precio2=(km/kmgaso)*precioGasolina;
        precio3=precio1+precio2*dia;
        
        System.out.println("El costo total del viaje es: "+precio3);
        System.out.println("HECHO POR MARIO");
        
    }
    
}
