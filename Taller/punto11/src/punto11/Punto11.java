/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class Punto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int numero,unida,dece,cent,um;
        
        System.out.println("Ingresa un numero entre el 0 y el 1000: ");
        numero=entrada.nextInt();
        unida=numero%10;
        numero=numero/10;
        dece=numero%10;
        numero=numero/10;
        cent=numero%10;
        numero=numero/10;
        
        System.out.println("Unidades: "+unida);
        System.out.println("Decenas: "+dece);
        System.out.println("Centenas: "+cent);
        System.out.println("HECHO POR MARIO");
        
        
        
    }
    
}
