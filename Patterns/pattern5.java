package patterns;
import java.util.*;
public class pattern5 {
/*
  *****
   ****
    ***
     **
      *
*/
    public static void main(String[] args)
     {
        Scanner take= new Scanner (System.in);
        int x= take.nextInt();
        for (int i=x;i>0;i--)
        {
           
            for (int j=1;j<=x;j++)
            {
                if(i+j>=x+1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
        }
            System.out.println("");
        }
        }
}
