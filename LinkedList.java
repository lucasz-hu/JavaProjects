import java.io.*;
import java.util.*;

public class LinkedList
{
	private ListElem head;  // REF TO 1ST ELEM IN LIST

	// #######################################################################
	// #### G I V E N  A S  I S.  D O  N O T  M O D I F Y / D E L E T E   ####
	// #######################################################################

	public LinkedList()
	{	head = null; //MUST BE INIALIZED TO NULL
	}

	// LOAD LINKED LIST FROM INCOMING FILE
	public LinkedList( String fileName ) 
	{	Scanner infile=null;
		try
		{	infile = new Scanner( new File( fileName ) );
		}
		catch ( Exception e )
		{	System.out.println( "FATAL ERROR: " + e );
			System.exit(0);
		}
		while ( infile.hasNext() ) insertAtFront( infile.next() );  
		infile.close();
	}	
	
	// SPLICE NEW ELEM ONTO FRONT PUSH EXISTING ELEMs TO RIGHT
	public void insertAtFront( String data)
	{	head = new ListElem(data,head);
	}

	// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	// $$$$$ Y O U  W R I T E  T H E S E  F O U R  M E T H O D S  B E L O W $$$$$
	// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

	// WORTH 15%  WRITE & TEST THIS ONE FIRST
	// OF COURSE MORE EFFICIENT TO KEEP INTERNAL COUNTER BUT YOU MUST COMPUTE DYNAMICALLY WITH TRAVERSAL
	public int size()
	{	int counter=0;ListElem head1=head;
		while(head1!=null)
		{
			counter++;
			head1=head1.getNext();
		}			// REPLACE W/YOUR CODE. TTRAVERSE LIST & COUNT ListElemS
		return counter;
	}
	
	
	// WORTH 25%  WRITE & TEST THIS ONE SECOND
	public void printList()
	{	for(ListElem head1=head;head1!=null;head1=head1.getNext())
		{	if(head1.getNext()==null)
				System.out.println(head1.getData());
			else
				System.out.print(head1.getData()+"->");
		}
		System.out.println();
		
	}

	// WORTH 35% WRITE & TEST THIS ONE THIRD
	// RETURN TRUE/FALSE ListElem CONTAINING KEY FOUND IN LIST
	public boolean contains( String key )
	{	boolean found=false;
		for(ListElem head1=head;head1!=null;head1=head1.getNext())
		{	if(head1.getData().equals(key))
			return true;
		}
		return false;
	}

	// WORTH 25%   WRITE & TEST THIS ONE LAST. NOT ALLOWED TO DECLARE ANY ADDITINAL DATA STRUCTURES 
	// DO NOT PUT ANY ARRAOWS BETWEEN ELEMENTS. JUST PUT ONE SPACE BETWEEN
	public void printListRev()
	{	
		printListRev(head);
		System.out.println();
		
		
	}
	public void printListRev(ListElem curr)
	{	if(curr==null)
		{	
		    return;
		}
		printListRev(curr.getNext());
		System.out.print(curr.toString()+" ");
	}
	
	
} //END LINKEDLIST CLASS */