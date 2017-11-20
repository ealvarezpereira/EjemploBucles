/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobucles;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class BucleDoWhile {
   
    public void calcularDoWhile(){
    int i = 0, asum = 0, aprd = 1, num;
    Scanner sc = new Scanner(System.in);
        System.out.println("Bucle doWhile");   
    do {
        System.out.println("Introduce un valor");
        num = sc.nextInt();
        asum=asum+num;
        aprd=aprd*num;
        i++;
    } while (i<7);
    
        System.out.println("Suma= "+asum+"Producto= "+aprd);
    }
}
