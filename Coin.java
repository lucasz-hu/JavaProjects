import java.util.Random;
public class Coin
{   private final int HEADS=1;
    private final int TAILS=0;
	private Random r;
	private int numHeads, numTails;
	public Coin(int seed)
	{	r = new Random(seed);
		reset();
	}
	public int getNumHeads()
	{	return numHeads;
	}
	public int getNumTails()
	{	return numTails;
	}
	public String flip()
	{	int side=r.nextInt(2);
		if(side==HEADS)
		{
			setNumHeads(getNumHeads()+1);
			return "H";
		}
		else
		{
			setNumTails(getNumTails()+1);
			return "T";
		}
		
	}
	public void reset()
	{	setNumHeads(0);
		setNumTails(0);
	}
	private void setNumHeads(int h)
	{	numHeads=h;
	}
	private void setNumTails(int t)
	{	numTails=t;
	}
	
	

} // END COIN CLASS