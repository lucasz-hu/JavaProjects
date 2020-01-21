import java.io.*;
import java.util.*;

public class Graph
{
	private final int NO_EDGE = -1; // all real edges are positive
	private Edge G[];              // will point to a 1D array of Edge references to hold our graph data

	private int numEdges;
	public Graph( String graphFileName ) throws Exception  // since readFild doesn't handle them either
	{
		loadGraphFile( graphFileName );
	}

	
	

	///////////////////////////////////// LOAD GRAPH FILE //////////////////////////////////////////
	//
	// FIRST NUMBER IN GRAPH FILE IS THE SQUARE G.length OF OUR 2D ARRAY
	// THE REST OF THE LINES EACH CONTAIN A TRIPLET <ROW,COL,WEIGHT> REPRESENTING AN EDGE IN THE GRAPH

	private void loadGraphFile( String graphFileName ) throws Exception
	{
		Scanner graphFile = new Scanner( new File( graphFileName ) );

		int dimension = graphFile.nextInt();   	
		G = new Edge[dimension];
		numEdges=0;

		while(graphFile.hasNextInt())
		{	int source=graphFile.nextInt();
			int dest=graphFile.nextInt();
			int weight=graphFile.nextInt();
			InsertFront(source, dest, weight);
		}
	}
	private void InsertFront(int source, int dest, int weight)
	{
		G[source]=new Edge(dest,weight, G[source]);
		
	}
		
/*
	private void addEdge( int r, int c, int w )
	{
		G[r][c] = w;
		++numEdges; // only this method adds edges so we do increment counter here only
	}
	*/
  private boolean hasEdge(int fromNode, int toNode)//add OOB
   {
		if(fromNode>=G.length)
			return false;
		
			for(Edge curr=G[fromNode];curr!=null;curr=curr.next)
			{
				if(curr.dest==toNode)
					return true;
			}
		return false;
   }
   private void remove(int source, int destination )
   {	Edge curr = G[source];
		if(curr.dest==destination)//checking if the first element must be removed
			G[source]=curr.next;
		else
		{
			for(curr=G[source];curr.next!=null;curr=curr.next)
			{
				if((curr.next).dest==destination)
				{	if(curr.next.next==null)//if last element must be deleted
					{
						curr.next=null;
						break;
					}
					else //if middle element must be deleted
					{
						curr.next=(curr.next).next;
						break;
					}
				}
			}
		}
   }		

	// IN DEGREE IS NUMBER OF ROADS INTO THIS CITY
	// NODE IS THE ROW COL#. IN DEGREE IS HOW MANY POSITIVE NUMBERS IN THAT COL
	private int inDegree(int node)
	{	int counter=0;
		for(int i=0;i<G.length;i++)
		{
			for(Edge curr=G[i];curr!=null;curr=curr.next)
			{
				if(curr.dest==node)
					counter++;
			}
		}
			
		return counter;
	}

	// OUT DEGREE IS NUMBER OF ROADS OUT OF THIS CITY
	// NODE IS THE ROW #. IN DEGREE IS HOW MANY POSITIVE NUMBERS IN THAT ROW
	private int outDegree(int node)
	{
		int counter=0;
		for(Edge curr=G[node];curr!=null;curr=curr.next)
		{
			counter++;
		}
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
				remove(fromNode,toNode);
		}
		catch(Exception e)
		{
			System.out.print("java.lang.Exception: Non Existent Edge Exception: removeEdge("+fromNode+","+toNode+")");
		}
	}
	

	// TOSTRING
	public String toString()
	{	String the2String = "";
		for(int i=0;i<G.length;i++)
		{	the2String+=i+":";
			for(Edge curr=G[i];curr!=null;curr=curr.next)
			{	the2String+=" -> ";
				the2String+="["+curr.dest+","+curr.weight+"]";
			}
			the2String+="\n";
		}
		return the2String;
	} // END TOSTRING

}
class Edge
{
	int dest, weight;
	Edge next;
	Edge(int dest, int weight, Edge next)
	{	this.dest=dest;
		this.weight=weight;
		this.next=next;
	}
}