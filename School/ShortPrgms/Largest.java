

import java.util.Scanner;
public class Largest
{
    
    public static void main()
    {
        int n1,n2;
        
        Scanner kb1=new Scanner(System.in);
        System.out.println("Enter the first number");
        n1=kb1.nextInt();
        Scanner kb2=new Scanner(System.in);
        System.out.println("Enter the second number");
        n2=kb2.nextInt();       
       
        if (n1>n2) 
                System.out.println("The Smallest number is "+n2);
        else
        if (n1<n2)
                System.out.println("The smallest number is "+n1);
        else
                System.out.println("The given numbers are equal");
            }
        }
      

