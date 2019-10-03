
import java.util.Scanner;
public class PositiveNegative
{
    public static void main()
    {
        int n;
        
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number");
        n=kb.nextInt();
      
        System.out.println("The value of double k ="+n);
        if (n>0) 
                System.out.println("The given number is Positive");
        else
        if (n<0)
                System.out.println("The given number is negative");
        else
                System.out.println("The given number is zero");
            }
        }
        