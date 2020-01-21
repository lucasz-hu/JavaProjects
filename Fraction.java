public class Fraction implements Comparable<Fraction>
{
	private int numer;
	private int denom;

	// ACCESSORS (SETTERS)
	public int getNumer()
	{	return numer;
	}
	public int getDenom()
	{	return denom;
	}
	// MUTATORS (GETTERS)
	public void setNumer( int n )
	{	numer = n;
	}
	public void setDenom( int d )
	{
		if (d==0) { System.out.println("Can't have 0 in denom"); System.exit(0); }
		else denom=d;
	}
	// FULL CONSTRUCTOR - an arg for each class data member
	public Fraction( int n, int d )
	{	int gcd = gcd( n, d );
		setNumer(n/gcd);
		setDenom(d/gcd);
	}
	private int gcd( int n, int d )
	{	int gcd = n<d ? n : d; // same as::  if (n<d) gcd=n; else gcd=d;
		while( gcd > 0 ) // NOT EFFICIENT AS EUCLID BUT SIMPLE
			if (n%gcd==0 && d%gcd==0) 
				return gcd; 
			else --gcd;
		return 1; // they were co-prime no GCD except 1 :(
	}
	// COPY CONSTRUCTOR - takes ref to some already initialized Comparable<Fraction> object
	public Fraction( Fraction other )
	{
		this( other.getNumer(), other.getDenom() ); // call my full C'Tor with other Fraction's data
	}
	public Fraction subtract(Fraction other)
	{
		return new Fraction((this.numer*other.denom-other.numer*this.denom),(this.denom * other.denom));
	}
	// REQUIRED BY THE COMPARABLE INTERFACE 
	// if this == other return 0; if this>other return 1; else return -1
	public int compareTo( Fraction other )
	{
		int diff=(subtract(other)).numer;
		
		if(diff<0 && this.numer<0)
		return 1;
		else if(diff<0 && this.numer>0)	
		return -1;
		else if(diff>0 && this.numer>0)
		return 1;
		else if(diff>0 && this.numer<0)
		return -1;
		else
		return 0;
	}
	public String toString()
	{
		return getNumer() +  "/" + getDenom() + "\t=" +  + ((double)getNumer()/(double)getDenom()); 
	}
}// EOF

