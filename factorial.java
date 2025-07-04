
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class factorial
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b=1,i;
        System.out.println("Enter the number");
        a=in.nextInt();
        for(i=1;i<=a;i++)
        {
            b=b*i;
        }
        System.out.println("factorial of number:" +b);
    }
}
