/*
	Exercise2.java
	- WRITE A SINGLE DO LOOP THAT DOES THE FOLLOWING UNTIL THE USER ENTERS AN INT IN 1..100 INCLUSIVE
	- 	USE TRY CATCH TO READ AN INT FROM THE KBD SUCH THAT IF USER ENTERS "FOO" IT DOES NOT CRASH
	- 	BE SURE TO MANUALLY THROW AN EXCEPTION & CATCH IT FOR THE CASE OF USER ENTERING AN VALID 
	-	INT THAT HAPPENS TO BE OUT OF RANGE.

*/
import java.io.*;
import java.util.*;

public class Exercise2
{
	public static void main( String args[] )
	{	Scanner kbd = null;
		boolean f=true;
		int num=0;
		do
		{
			try
			{
			kbd = new Scanner(System.in);
			System.out.print("Enter int in range 1..100 inclusive: ");
			num=kbd.nextInt();
			if(num<1 || num>100)
				System.out.println("Number;"+num+" out of range. Must be in 1..100");
			else 
				{
					System.out.format("Thank you. You entered %d\n", kbd.nextInt() );
					f=false;
				}
			}
			catch(InputMismatchException im)
			{
				System.out.println("Input was not an integer");
			}
		/*
			catch(Exception out_of_bounds)
			{
				System.out.print("Number;"+num+" out of range. Must be in 1..100");
				throw out_of_bounds;
			} */
		} while(f);
	}
		
		
} 
