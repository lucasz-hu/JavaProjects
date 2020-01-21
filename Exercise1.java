	
import java.io.*;
import java.util.*;
public class Exercise1
{
	public static void main( String args[] ) 
	{
		if (args.length < 1)
		{
			System.out.println("\nYou must enter an input filename on cmd line!\n");
			System.exit(0);
		}
		Scanner infile=null;
		Scanner sc=new Scanner(System.in);
		
		// MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
		
		boolean f=true;
		do
		{
			try
			{
				infile = new Scanner(new File( args[0] )) ;
				f=false;
			}
			catch(FileNotFoundException e)
			{
				System.out.print(args[0]+" not found. Enter valid file name: ");
				
				args[0]=sc.next();
				
			}
			
			
			
		} while (f );



		// THE CODE BELOW IS -AFTER, BELOW AND OUTSIDE OF- THE ABOVE LOOP 
		
		while (infile.hasNext())
		{
			String token = infile.next(); // read a string from infile
			System.out.printf("%s\n", token);
		}
	}
} //END CLASS