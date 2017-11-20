package ejemplobucles;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class BucleWhile {
    
    public void calcularWhile (){
        Scanner sc = new Scanner(System.in);
        int i = 0, asum = 0, aprd = 1, num;
        System.out.println("Bucle While");
        while (i<7){
            System.out.println("Introduce un número");
            num=sc.nextInt();
            asum=asum+num;
            aprd=aprd*num;
            i++;
        }
        
        System.out.println("Suma= "+asum+"Producto= "+aprd);
    }
}
