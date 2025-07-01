
/**
 * Write a description of class addition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class calculator
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int a,b,c;
        double result;
        System.out.println("Enter the operation '1' for 'multiplication','2' for 'addition','3' for 'subtraction','4' for 'division'");
        a=in.nextInt();
        System.out.println("Enter a number");
        b=in.nextInt();
        System.out.println("Enter a number");
        c=in.nextInt();
        switch(a){
            case 1:
                result=b*c;
                System.out.print(result);
                break;
            case 2:
                result=b+c;
                System.out.print(result);
                break;
            case 3:
                result=b-c;
                System.out.print(result);
                break;
            case 4:
                result=b/c;
                System.out.print(result);
                break;
            default:
                System.out.println("Wrong Operation");
        }
    }
}
