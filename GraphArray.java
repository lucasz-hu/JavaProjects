/* This class was borrowed and modified as needed with permission from it's original author
   Mark Stelhik ( http:///www.cs.cmu.edu/~mjs ).  You can find Mark's original presentation of
   this material in the links to his S-01 15111,  and F-01 15113 courses on his home page.
*/
//max out=row max in=column
import java.io.*;
import java.util.*;

public class GraphArray
{
	private final int NO_EDGE = -1; // all real edges are positive
	private int G[][];              // will point to a 2D array to hold our graph data

	private int numEdges;
	public GraphArray( String graphFileName ) throws Exception  // since readFild doesn't handle them either
	{
		loadGraphFile( graphFileName );
		
//		T E M P O R A R Y    C O D E    T O    V E R I F Y    P R I V A T E 
// 		M E T H O D S    W E    C A N T    C A L L    F R O M   T E S T E R 
//		      ........R E M O V E   A F T E R   T E S T I N G .......
/*
		for (int node = 0 ; node < G.length ; ++node )
		{
			System.out.format( "DEBUG:: in (%d)=%d  ",node,inDegree(node) );
			System.out.format( "out(%d)=%d  ",node,outDegree(node) );
			System.out.format( "deg(%d)=%d\n",node,degree(node) );
		}
*/
	}

	
	

	///////////////////////////////////// LOAD GRAPH FILE //////////////////////////////////////////
	//
	// FIRST NUMBER IN GRAPH FILE IS THE SQUARE G.length OF OUR 2D ARRAY
	// THE REST OF THE LINES EACH CONTAIN A TRIPLET <ROW,COL,WEIGHT> REPRESENTING AN EDGE IN THE GRAPH

	private void loadGraphFile( String graphFileName ) throws Exception
	{
		Scanner graphFile = new Scanner( new File( graphFileName ) );

		int dimension = graphFile.nextInt();   	// THE OF OUR N x N GRAPH
		G = new int[dimension][dimension]; 		// N x N ARRAY OF ZEROS
		numEdges=0;

		// WRITE A LOOP THAT PUTS NO_EDGE VALUE EVERYWHERE EXCPT ON THE DIAGONAL
		for(int row=0;row<G.length;row++)
		{
			for(int col=0;col<G.length;col++)
			{
				if(row!=col)
					G[row][col]=NO_EDGE;
			}
		}
		while(graphFile.hasNextInt())
		{	int row=graphFile.nextInt();
			int col=graphFile.nextInt();
			int w=graphFile.nextInt();
			G[row][col]=w;
		}
	}

	private void addEdge( int r, int c, int w )
	{
		G[r][c] = w;
		++numEdges; // only this method adds edges so we do increment counter here only
	}
	
  private boolean hasEdge(int fromNode, int toNode)//add OOB
   {
		if(fromNode<0 || fromNode>=G.length || toNode<0 || toNode>=G.length)
			return false;
		if(G[fromNode][toNode]!=NO_EDGE)
			return true;
	return false;
   }

	// IN DEGREE IS NUMBER OF ROADS INTO THIS CITY
	// NODE IS THE ROW COL#. IN DEGREE IS HOW MANY POSITIVE NUMBERS IN THAT COL
	private int inDegree(int node)
	{	int counter=0;
		for(int i=0;i<G.length;i++)
			if(G[i][node]>0)
				counter++;
		return counter;
	}

	// OUT DEGREE IS NUMBER OF ROADS OUT OF THIS CITY
	// NODE IS THE ROW #. IN DEGREE IS HOW MANY POSITIVE NUMBERS IN THAT ROW
	private int outDegree(int node)
	{
		int counter=0;
		for(int i=0;i<G.length;i++)
			if(G[node][i]>0)
				counter++;
		return counter;	
	}

	// DEGREE IS TOTAL NUMBER OF ROAD BOTH IN AND OUT OFR THE CITY 
	private int degree(int node)
	{
		return (inDegree(node)+outDegree(node));
	}

	// PUBLIC METHODS 
	
	public int maxOutDegree()
	{
		int maxOut=0;
		for(int i=0;i<G.length;i++)
		{
			if(outDegree(i)>maxOut)
				maxOut=outDegree(i);
		}
		return maxOut;
	}

	public int maxInDegree()
	{	int maxIn=0;
		for(int i=0;i<G.length;i++)
		{
			if(inDegree(i)>maxIn)
				maxIn=inDegree(i);
		}
		return maxIn;
	}

	public int minOutDegree()
	{
		int minOut=outDegree(0); 
		for(int i=1;i<G.length;i++)
		{
			if(outDegree(i)< minOut)
				minOut=outDegree(i);
		}
		return minOut;
	}

	public int minInDegree()
	{
		int minIn=inDegree(0);  
		for(int i=1;i<G.length;i++)
		{
			if(inDegree(i)<minIn)
				minIn=inDegree(i);
		}
		return minIn;
	}
	
	public int maxDegree()
	{
		int maxDeg=0;
		for(int i=0;i<G.length;i++)
		{
			if(degree(i)>maxDeg)
				maxDeg=degree(i);
		}
		return maxDeg;
	}

	public int minDegree()
	{
		int minDeg=degree(0); 
		for(int i=1;i<G.length;i++)
		{
			if(degree(i)<minDeg)
				minDeg=degree(i);
		}
		return minDeg;
	}

	public void removeEdge(int fromNode, int toNode)
	{	try {
			
			if(!hasEdge(fromNode,toNode))
				throw new Exception();
			else
				G[fromNode][toNode]=NO_EDGE;
		}
		catch(Exception e)
		{
			System.out.print("java.lang.Exception: Non Existent Edge Exception: removeEdge("+fromNode+","+toNode+")");
		}
	}
	
	
	// TOSTRING
	public String toString()
	{	String the2String = "";
		for (int r=0 ; r < G.length ;++r )
		{
			for ( int c=0 ; c < G[r].length ; ++c )
				the2String += String.format("%3s",G[r][c] + " ");
			the2String += "\n";
		}
		return the2String;
	} // END TOSTRING

} //EOF



