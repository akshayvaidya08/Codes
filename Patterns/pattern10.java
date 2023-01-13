package patterns;
import java.util.*;
/* 
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * 
       *
      */
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        for (int i = n; i > 0; ) {
            for (int k=0;k<n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=0; j<(2*i)-1;j++)
            {
                System.out.print("* ");
            } 
            System.out.println();
            
            i--;
        }
    }
}
