package patterns;
import java.util.Scanner;
/*
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *
 */
public class pattern14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        for (int i=0;i<2*n-1;i++)
        { 
            int row=0;
            if (i>=n)
            {
                row=((2*n)-i)-2;
            }
            else{
                row=i;
            }
            for (int k=0;k<(n-row)-1;k++)
            {                 
                    System.out.print("  ");               
            }
            for(int j=0;j<=row;j++)
            {   
                System.out.print("* ");
            } 
           
            System.out.println();
        }
    }
}
