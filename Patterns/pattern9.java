package patterns;
import java.util.*;
public class pattern9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
 
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j <x-i-1; j++) {
                System.out.print(" ");
            }
 
        
            for (int k = 0; k <2*i+1; k++) {
                System.out.print("*");
            }
 

            System.out.println();
        }
    }

}

