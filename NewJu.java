 import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewJu {
	static int dictionary_sum,jumbled_sum,jumbled_product,dictionary_product;
	static boolean lcompare(String jumbled_word, String word)
	{
		dictionary_sum=0;dictionary_product=1;jumbled_product=1;jumbled_sum=0;
		int length = jumbled_word.length();
        for(int i=0;i<length;i++)
		{   int temp1=(int)jumbled_word.charAt(i);
			int temp2=(int)word.charAt(i);
			jumbled_sum+=temp1;
			dictionary_sum+=temp2;
			jumbled_product*=temp1;
			dictionary_product*=temp2;
		}
		if(dictionary_sum==jumbled_sum && dictionary_product==jumbled_product)
			return true;
		else
			return false;
			
	}
    public static void main(String args[])throws IOException
	{   long start = System.nanoTime();
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java 3 <numbers file> <words filename>\n\n"); 
			System.exit(0);
		}
		ArrayList<String> dictionary=new ArrayList<String>();
		ArrayList<String> jumbled=new ArrayList<String>();
		

		BufferedReader wordFile = new BufferedReader( new FileReader(args[0]) );

		// P R O C E S S   D I C T I O N A R Y    F I L E
		while ( wordFile.ready() ) // i.e. while there is another line (word) in the file
		{   dictionary.add(wordFile.readLine());
		}
		BufferedReader wordFile2 = new BufferedReader( new FileReader(args[1]) );
		// P R O C E S S   J U M B L E S    F I L E
		while ( wordFile2.ready() ) // i.e. while there is another line (word) in the file
		{
			jumbled.add(wordFile2.readLine());
		} 
		Collections.sort(jumbled);
		ArrayList<String> found=new ArrayList<String>();
		for(String jw : jumbled)
		{   System.out.print(jw+" ");
	        found.clear();
			for(String word : dictionary)
			{   if(word.length()==jw.length())
				{
				if(lcompare(jw,word))
				{	found.add(word);
				}
				}
			}
			Collections.sort(found);
			for(String f : found)
			{	System.out.print(f+" ");
			}
			System.out.println();
		    }
			long end = System.nanoTime();
        System.out.println(((end - start) / 1000000.0) + " ms");
		}
	 
		
	}
