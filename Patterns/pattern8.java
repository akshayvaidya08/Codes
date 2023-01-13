package patterns;
import java.util.*;
public class pattern8 
{
    public static void main(String[] args) {
        Scanner take = new Scanner (System.in);
            int n= take.nextInt();
            for( int i=0;i<n; i++)
            {
                for( int j=0;j<n; j++)
                {
                    if(i==j || i+j==n-1 ) 
                    {
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                } 
                System.out.println(""); 
            }
}}
