
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the number");
        a=in.nextInt();
        b=0;d=a;
        while(a!=0)
        {
            c=a%10;
            b=b*10+c;
            a=a/10;
        }
        if(b==d)
        {
            System.out.println("It is a palindrome  number");
        }
        else{
            System.out.println("It is not a palindrome  number");
        }
    }
}
