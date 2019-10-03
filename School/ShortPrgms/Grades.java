import java.util.Scanner;
public class Grades
{  
   public static void main(String args[])
   {
       int total;
       Scanner kb=new Scanner(System.in);
       System.out.println(" Enter the Total Marks");
       total=kb.nextInt();
       if ( total>=80)
            System.out.println(" Grade - A");
       else if ((total>59)&&(total<=80))
            System.out.println("Grade - B");
       else if ((total>=40)&&( total<=59))
            System.out.println("Grade - C");
       else
            System.out.println("Grade - D");
        }
}

