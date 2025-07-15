
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
        int n,num,count=0,b,s=0,a;
        System.out.println("Enter a number");
        n=in.nextInt();
        num=n;
        b=n;
        while(b>0)
        {
            count+=1;
            b/=10;
        }
        while(n>0)
        {
           a=n%10;
           s+=Math.pow(a,count);
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
