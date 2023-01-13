package patterns;
import java.util.Scanner;
/*
s*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
 */
public class pattern12 {
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
           
            for(int j=0;j<=row;j++)
            {   
                System.out.print("* ");
            } 
            for (int k=0;k<(n-i)-1;k++)
            {                 
                    System.out.print(" ");               
            }
            System.out.println();
        }
    }

}
