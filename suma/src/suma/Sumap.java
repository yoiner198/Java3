package suma;

import java.util.Scanner;

/**
 *
 * @author conmu
 */
public class Sumap {
    
    public static void main(String[] args) {
        
        Suma ar = new Suma();
        Scanner zr = new Scanner(System.in);
        
        ar.setN1=zr.nextInt();
        ar.setN2=zr.nextInt();
        
        System.out.println(ar.rSuma());
    }
    
}
