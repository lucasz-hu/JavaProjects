

import java.util.Scanner;
public class AgeCategory
{
   public static void main(String args[])
   {
       int age;
       Scanner kb=new Scanner(System.in);
       System.out.println(" Enter the Age");
       age=kb.nextInt();
       if (age<=3)
            System.out.println("Baby");
       else if ((age>3)&&(age<=12))
            System.out.println("Child");
       else if ((age>12)&&(age<=19))
            System.out.println("Teenager");
       else
            System.out.println("Adult");
        }
}
