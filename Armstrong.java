
/**
 * Write a description of class Armstrong here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,n,num,s=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        num=n;
        while(n>0)
        {
           a=n%10;
           s=s+(a*a*a);
           n=n/10;
        }
        if(num==s)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
