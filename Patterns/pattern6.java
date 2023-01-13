package patterns;
import java.util.*;
/*
*****
  ****
    ***
      **
        *


 */


public class pattern6 {
public static void main(String[] args) {
Scanner take = new Scanner (System.in);
    int n= take.nextInt();
    for( int i=1;i<=n; i++)
    {
        for( int j=i;j<=n; j++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
        if(i!=n)
        {
        for( int k=0;k<i; k++)
        {
            System.out.print("@"+"@");
        }
    }
    }
}
}
