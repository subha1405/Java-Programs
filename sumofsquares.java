
/**
 * Write a description of class series here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class sumofsquares
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,s1=0,b;
        System.out.println("Enter the number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            b=i*i;
            s1=s1+b;
        }
        System.out.println("Sum of Squares of numbers:"+s1);
    }
}
