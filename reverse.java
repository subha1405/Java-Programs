
/**
 * Write a description of class reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        int b,c=0;
        while(a!=0)
        {
            b=a%10;
            c=c*10+b;
            a=a/10;
        }
        System.out.println("The reverse of a number:" +c);
    }
}
