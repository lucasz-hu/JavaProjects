import java.io.*;
import java.util.*;

public class Project9
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
				throw new NumberOutOfRangeException();
			else 
				{
					System.out.format("Thank you. You entered %d\n", num );
					f=false;
				}
			}
			catch(InputMismatchException im)
			{
				System.out.println("Input was not an integer");
			}
		
			catch(NumberOutOfRangeException e)
			{
				
			} 
			catch(Exception general)
			{
				System.out.println("general exception caught");
			}
			
		} while(f);
	}
		
		
} 
class NumberOutOfRangeException extends Exception
{
	NumberOutOfRangeException()
	{	
		System.out.println("Number out of range. Must be in 1..100");
	}
}
