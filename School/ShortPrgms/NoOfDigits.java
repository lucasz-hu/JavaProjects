

import java.util.Scanner;
public class NoOfDigits
{
  public static void main(String args[])
  {
      int n;
      Scanner ipv= new Scanner(System.in);
      System.out.println("Enter any number less than 1000");
      n=ipv.nextInt();
      if ((n>0)&&(n<10))
            System.out.println("It is a single digit number");
      else if ((n>=10)&&(n<=99))
            System.out.println("It is a double digit number");
      else if ((n>=100)&&(n<=999))
            System.out.println("It is a Triple digit number");
      else
            System.out.println("Number out of bounds");
}
}
