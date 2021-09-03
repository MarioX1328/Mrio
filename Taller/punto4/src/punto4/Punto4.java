/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.util.Scanner;

/**
 *
 * @author MarSar
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float radio,area,longitud,nm;
        
        System.out.println("Ingresa el radio de la circunferencia: ");
        radio= entrada.nextFloat();
        
        longitud= (float) (2*3.1416*radio);
        nm=radio*radio;
        area=(float) (3.1416*nm);
        System.out.println("La longitud es: "+longitud);
        System.out.println("El areas es: "+area);
        System.out.println("HECHO POR MARIO");
        
        
        
        
    }
    
}
