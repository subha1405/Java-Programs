
/**
 * Write a description of class Prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter a number");
        a=in.nextInt();
        for(b=1;b<=a;b++)
        {
            if(a%b==0){
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a prime Number");
        }
    }
}
