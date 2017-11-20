/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobucles;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author quique
 */
public class SwitchElegir {
    
    public void switchCase () throws IOException{
    
        Scanner sc = new Scanner(System.in);
        BucleWhile bwhile = new BucleWhile();
        BucleDoWhile bdwhile = new BucleDoWhile();
        BucleFor bfor = new BucleFor();

        System.out.println("**** MENU ****\n1-While\n2-Do...While\n3-For\n0-Salir");
        System.out.println("Introduce una opcion");
        int op=sc.nextInt();
        String salto;
        while(op == 1 || op == 2 || op == 3){
        switch(op){
        case 1: bwhile.calcularWhile();
            break;
        case 2: bdwhile.calcularDoWhile();
            break;
        case 3: bfor.calcularFor();
            break;
        default: System.out.println("Error");
        }
        
        
        System.out.println("\n**** MENU ****\n1-While\n2-Do...While\n3-For\n0-Salir");
        op = sc.nextInt();
        
        
        
        }
    
    
    }
    
}
