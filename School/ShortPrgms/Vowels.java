import java.util.Scanner;

public class Vowels
{
   public static void main(String args[])
   {
      char alpha;
       Scanner kb=new Scanner(System.in);
       System.out.println("Ener a letter");
       alpha=kb.next().charAt(0);
       if (alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
            System.out.println("It is a vowel");
       else 
            System.out.println("It is a Consonant");
    }
}
