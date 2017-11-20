package ejemplobucles;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class BucleFor {
    
    public void calcularFor(){
        
        int asum = 0, aprd = 1, num;
        Scanner sc = new Scanner(System.in);
            System.out.println("Bucle for");    
        for (int i=0; i<7; i++){
            System.out.println("Introduce un valor:");
            num = sc.nextInt();
            asum = asum + num;
            aprd = aprd * num;
        }
        System.out.println("Suma= "+asum+"Producto= "+aprd);
    }
    
}
