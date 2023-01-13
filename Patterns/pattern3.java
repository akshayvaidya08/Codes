/*

*****
****
***
**
*
 
*/
package patterns;
import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner take= new Scanner (System.in);
        int x= take.nextInt();
        for (int i=0;i<x;i++)
        {
            for (int j=i;j<x;j++)
            {
            System.out.print("*");     
            }
            System.out.println("");
        }
        }
}
