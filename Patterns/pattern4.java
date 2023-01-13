package patterns;
import java.util.*;
/*

    *
   ** 
  *** 
***** 

 
*/
public class pattern4 {
    public static void main(String[] args)
     {
        Scanner take= new Scanner (System.in);
        int x= take.nextInt();
        for (int i=0;i<x;i++)
        {
            for (int j=0;j<x;j++)
            {
                if(i+j<x-1)
                {
                    System.out.print("@");
                }
                else{
                    System.out.print("*");  
            }
        }
            System.out.println("");
        }
        }
}
