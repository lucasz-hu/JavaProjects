public class MyString
{
	final int NOT_FOUND = -1; // USE THIS IN PLACE OF LITERAL -1

	private char[] letters;
	
	// DO NOT MODIFY THESE TWO CONTRUCTORS IN ANY WAY. USE AS GIVEN!
	public MyString( String other )
	{	
		letters = other.toCharArray(); // DO NOT CHANGE/ADD/MODIFY IN ANY WAY
	}
	public MyString( MyString other )
	{		
		this( other.toString() ); // DO NOT CHANGE/ADD/MOFIDY IN ANY WAY
	}
	public int length()
	{
		return letters.length; // JUST TO MAKE IT COMPILE. REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	public char charAt(int index) // IF INDEX OUT OF BOUNDS. EXIT PROGRAM! (dont return anything)
	{
    	if (index<0 || index>=this.length())
		{
			System.out.println("\nFATAL ERROR: charAt() given invalid index\n");
			System.exit(0);
		}
		return letters[index];
	}
	private int comparison(MyString other)
	{
		int value=0;
		if(this.length()<other.length())
		{
			for(int i=0;i<this.length();i++)
			{
				if(!((int)this.charAt(i)==(int)other.charAt(i)))
				{
					value=this.charAt(i)-other.charAt(i);
					break;
				}
				if(i==this.length()-1)
				{
					if(this.charAt(i)==other.charAt(i))
						value=-1;
					else
						value=this.charAt(i)-other.charAt(i);
				}
			}
		}
		if(this.length()>other.length())
		{
			for(int i=0;i<other.length();i++)
			{
				if(!((int)this.charAt(i)==(int)other.charAt(i)))
				{
					value=this.charAt(i)-other.charAt(i);
					break;
				}
				if(i==this.length()-1)
				{
					if(this.charAt(i)==other.charAt(i))
						value=1;
					else
						value=this.charAt(i)-other.charAt(i);
				}
			}
		}
		if(this.length()==other.length())
		{
			for(int i=0;i<other.length();i++)
			{
				if(!((int)this.charAt(i)==(int)other.charAt(i)))
				{
					value=this.charAt(i)-other.charAt(i);
					break;
				}
				if(i==this.length()-1)
				{
					if(this.charAt(i)==other.charAt(i))
						value=0;
					else
						value=this.charAt(i)-other.charAt(i);
				}
			}
		}
		return value;
	}
	public int compareTo(MyString other)
	{	int value=0;
		if(this.length()<other.length())
		{
			for(int i=0;i<this.length();i++)
			{
				if(!((int)this.charAt(i)==(int)other.charAt(i)))
				{
					value=this.charAt(i)-other.charAt(i);
					break;
				}
				if(i==this.length()-1)
				{
					if(this.charAt(i)==other.charAt(i))
						value=-1;
					else
						value=this.charAt(i)-other.charAt(i);
				}
			}
		}
		if(this.length()>other.length())
		{
			for(int i=0;i<other.length();i++)
			{
				if(!((int)this.charAt(i)==(int)other.charAt(i)))
				{
					value=this.charAt(i)-other.charAt(i);
					break;
				}
				if(i==other.length()-1)
				{
					if(this.charAt(i)==other.charAt(i))
						value=1;
					else
						value=this.charAt(i)-other.charAt(i);
				}
			}
		}
		if(this.length()==other.length())
		{
			for(int i=0;i<other.length();i++)
			{
				if(!((int)this.charAt(i)==(int)other.charAt(i)))
				{
					value=this.charAt(i)-other.charAt(i);
					break;
				}
				if(i==this.length()-1)
				{
					if(this.charAt(i)==other.charAt(i))
						value=0;
					else
						value=this.charAt(i)-other.charAt(i);
				}
			}
		}
		if(value==0)
			return 0;
		else if(value>0)
			return 1;
		else
			return NOT_FOUND;
	}
		
	public boolean equals(MyString other)
	{
		if(this.compareTo(other)==0)
				return true;
		return false;
	}
	// LOOKING for c but starting at [startIndex],  not at [0]
	// You should use this in your other Indexof Method
	public int indexOf(int startIndex, char ch)	
	{
		if (startIndex<0 || startIndex>=this.length())
		{
			System.out.println("\nFATAL ERROR: indexOf() given invalid startIndex\n");
			System.exit(0);
		}
		for(int i=startIndex;i<this.length();i++)
			if(letters[i]==ch)
				return i;
		return -1;
	}
	
	// IN THIS METHOD BELOW YOU MUST RE-USE indexOf( int startIndex, char ch) METHOD ABOVE
	public int indexOf(MyString key)
	{	int start=0;
		while(this.indexOf(start, key.charAt(0))!=-1)
		{   
			int index=this.indexOf(start,key.charAt(0));
			if(index+key.length()>=this.length())
				return NOT_FOUND;
			boolean flag=true; int j=0;
			for(int i=index;i<index+key.length();i++)
			{   
				if(this.charAt(i)!=key.charAt(j++))
				{   start=index+1;
					flag=false;
					break;
				}
			}
			if(flag)
				return index;
		}
		return NOT_FOUND;
			
			
			
		
	}
	public String toString()
	{   String str="";
		for(int i=0;i<this.length();i++)
			str=str+letters[i];
		return str;
	}
} // END MYSTRING CLASS
