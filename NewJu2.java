import java.io.*;
import java.util.*;

public class NewJu2 
{
	static int dictionary_sum,jumbled_sum,jumbled_product,dictionary_product;
	static String[] dictionary=new String[172823];
	static String[] jumbled=new String[49];
	
	static void insertInOrder( String[] arr, int count, String newVal )
	{	
		int index = bStringSearch( arr, count, newVal );
		
		if(index<0)
			index=-(index+1);
		for(int i=count-1;i>=index;i--)
			arr[i+1]=arr[i];
		arr[index] = newVal;
	}
	
	static int bStringSearch(String[] a, int count, String key)
	{
		int low=0;
		int mid;
        int high=count-1;

		while ( low <= high )
		{
			mid=low+(high-low)/2;
			if(a[mid].compareTo(key)==0)
				return mid;
			else if(a[mid].compareTo(key)<0)
			 high=mid-1;
			else
			low=mid+1;
		}
		return -(low+1);

	}

	static int bSearch(int[] a, int count, int key)
	{
		int low=0;
		int mid;
        int high=count-1;

		while ( low <= high )
		{
			mid=low+(high-low)/2;
			if(a[mid]==key)
				return mid;
			else if(a[mid]<key)
			 high=mid-1;
			else
			low=mid+1;
		}
		return -(low+1);

	}
	
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
	static boolean lesser(String jumbled_word, String word)
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
		if(dictionary_sum<jumbled_sum && dictionary_product<jumbled_product)
			return true;
		else
			return false;
			
	}
	
	static int bSearchWord(String[] a, int count, String key)
	{
		int low=0;
		int mid;
        int high=count-1;

		while ( low <= high )
		{
			mid=low+(high-low)/2;
			if(lcompare(a[mid],key))
				return mid;
			else if(lesser(key,a[mid]))
			high=mid-1;
			else
			low=mid+1;	
		}
		return -(low+1);

	}
    public static void main(String args[])throws IOException
	{   long start = System.nanoTime();
		
		BufferedReader wordFile = new BufferedReader( new FileReader(args[0]) );
        int count=0;
		// P R O C E S S   D I C T I O N A R Y    F I L E
		while ( wordFile.ready() ) // i.e. while there is another line (word) in the file
		{   insertInOrder(dictionary,count++,wordFile.readLine());
		}
		int count2=0;
		BufferedReader wordFile2 = new BufferedReader( new FileReader(args[1]) );
		// P R O C E S S   J U M B L E S    F I L E
		while ( wordFile2.ready() ) // i.e. while there is another line (word) in the file
		{   
			 insertInOrder(jumbled,count2++,wordFile.readLine());
		} 
		for(int i=0;i<count;i++)
			System.out.print(dictionary[i]);
		
		ArrayList<String> found=new ArrayList<String>();
		for(int jw=0;jw<count2;jw++)
		{   System.out.print(jumbled[jw]+" ");
	        found.clear();
			int index=bSearchWord(dictionary,count,jumbled[jw]);
			int low_search_index=index;
			if(low_search_index>0)
			{
				while(low_search_index>0)
			{   if(lcompare(dictionary[low_search_index],jumbled[jw]))
			  { low_search_index--;
			  }
			  else
			  { low_search_index=-1;
			  }
			}
			for(int i=low_search_index;;i++)
			{
				if(!lcompare(dictionary[i],jumbled[jw]))
					break;
			    found.add(dictionary[i]);
			}
			Collections.sort(found);
			}
			for(String f : found)
			{	System.out.print(f+" ");
			}
			System.out.println();
		    }
			long end = System.nanoTime();
        System.out.println(((end - start) / 1000000.0) + " ms");
		}
	 
	}

	
