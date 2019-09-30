/* Project2.java  Dynamic histogram */

import java.io.*;
import java.util.*;

public class Project2
{
	static final int INITIAL_CAPACITY = 10;
	public static void main (String[] args) throws Exception
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED INPUT FILE NAME ON THE COMMAND LINE
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java Project2 <input filename>\n\n"); // i.e. C:\> java Project2 dictionary.txt
			System.exit(0);
		}
		int[] histogram = new int[0]; // histogram[i] == # of words of length n

		/* array of String to store the words from the dictionary. 
			We use BufferedReader (not Scanner). With each word read in, examine it's length and update word length frequency histogram accordingly.
		*/

		String[] wordList = new String[INITIAL_CAPACITY];
		int wordCount = 0;
		BufferedReader infile = new BufferedReader( new FileReader(args[0]) );
		while ( infile.ready() )
		{
			String word = infile.readLine();
			// # # # # # DO NOT WRITE/MODIFY ANYTHING ABOVE THIS LINE # # # # #

			if(wordCount>=wordList.length)
			{ wordList=upSizeArr(wordList);
			}
			wordList[wordCount]=word;
			
            if(histogram.length<= word.length())
			{ histogram=upSizeHisto(histogram,word.length()+1);
			}
			// look at the word length and see if the histogram length is AT LEAST
			// word length + 1. If not, you must upsize histogram to be EXACTLY word length + 1
			++histogram[word.length()];
			// now you can increment the counter in the histogram for this word's length
		    wordCount++;
			//  # # # # # DO NOT WRITE/MODIFY ANYTHING BELOW THIS LINE  # # # # #
		} //END WHILE INFILE READY
		infile.close();

		wordList = trimArr( wordList, wordCount );
		System.out.println( "After final trim: wordList length: " + wordList.length + " wordCount: " + wordCount );

		// PRINT WORD LENGTH FREQ HISTOGRAM
		for ( int i = 0; i < histogram.length ; i++ )
			System.out.format("words of length %2d  %d\n", i,histogram[i] );

	} // END main

	// YOU MUST CORRECTLY COPY THE STRING REFS FROM THE OLD ARR TO THE NEW ARR
	static String[] upSizeArr( String[] fullArr )
	{	
		String[] newArray=new String[fullArr.length*2];
		for(int i=0;i<fullArr.length;i++)
		{ newArray[i]=fullArr[i];
		}
		
		return newArray; // just to make it complie you change as needed
	}
	static String[] trimArr( String[] oldArr, int count )
	{   String[] trimmedArr=new String[count];
	    for(int i=0;i<count;i++)
		{  trimmedArr[i]=oldArr[i];
		}
		
		return trimmedArr; // just to make it complie you change as needed
	}

	// YOU MUST CORRECTLY COPY THE COUNTS FROM OLD HISTO TO NEW HISTO
	static int[] upSizeHisto( int[] oldArr, int newLength )
	{
		int[] newHisto=new int[newLength];
		for(int i=0;i<oldArr.length;i++)
			newHisto[i]=oldArr[i];
		for(int i=oldArr.length;i<newLength;i++)
			newHisto[i]=0;
		return newHisto;
	}
} // END CLASS PROJECT#2