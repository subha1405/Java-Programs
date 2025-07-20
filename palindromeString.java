
/**
 * Write a description of class palindromeString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class palindromeString
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a,b="";
        int l,i;
        System.out.println("Enter a word");
        a=in.nextLine();
        l=a.length();
        for(i=l-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }
        System.out.println(b);
        if(a.equals(b))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
