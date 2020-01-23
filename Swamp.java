import java.io.*;
import java.util.*;
public class Swamp
{
	static int[][] swamp; 

 	public static void main(String[] args) throws Exception
	{
		int[] dropInPt = new int[2]; // row and col will be on the 2nd line of input file;
		swamp = loadSwamp( args[0], dropInPt );
		int row=dropInPt[0], col = dropInPt[1];
		String path = ""; // with each step grows to => "[2,3][3,4][3,5][4,6]" etc
		dfs( row, col, path );
	} // END MAIN

	private static void printSwamp(String label, int[][] swamp )
	{
		System.out.println( label );
		System.out.print("   ");
		for(int c = 0; c < swamp.length; c++)
			System.out.print( c + " " ) ;
		System.out.print( "\n   ");
		for(int c = 0; c < swamp.length; c++)
			System.out.print("- ");
		System.out.print( "\n");

		for(int r = 0; r < swamp.length; r++)
		{	System.out.print( r + "| ");
			for(int c = 0; c < swamp[r].length; c++)
				System.out.print( swamp[r][c] + " ");
			System.out.println("|");
		}
		System.out.print( "   ");
		for(int c = 0; c < swamp.length; c++)
			System.out.print("- ");
		System.out.print( "\n");
	}
	private static int[][] loadSwamp( String infileName, int[] dropInPt  ) throws Exception
	{
		Scanner sc=new Scanner(new File(infileName));
		int size= sc.nextInt();
		int[][] swamp=new int[size][size];
		dropInPt[0]=sc.nextInt();
		dropInPt[1]=sc.nextInt();
		
		
			for(int r=0;r<size;r++)
				for(int c=0;c<size;c++)
					swamp[r][c]=sc.nextInt();
			
		
		sc.close();
		return swamp;
		// THE FIRST NUMBER ON THE FIRST LINE WILL BE THE NUMBER OF ROWS & COLS
		// THE SECOND & THIRD NUMBER ON 1st LINE WILL BE THE DROP IN POINT X,Y
		// STORE SECOND NUMBER INTO dropInPt[0] THIRD # INTO dropInPt[1]
		// USING ROW, COL DEFINE A 2D ARRAY OF INT
		// USE A NESTED LOOP. OUTER LOOP ROWS, INNER LOOP COLS
		// READ IN THE GRID OF VALUES FROM THE INPUT FILE
		// CLOSE THE SCANNER
		// RETURN THE 2D ARRAY WITH VALUES LOADED INTO IT
	}

	static void dfs( int row, int col, String path ) // dfs = DEPTH FIRST SEARCH
	{
		path=path+"["+row+","+col+"]";
		if(row==0 || row==swamp.length-1 || col==0 || col==swamp.length-1)
		{	System.out.println(path);	
			return;
		}
		
		if(swamp[row-1][col]==1)
		{
			swamp[row][col]=-1;
			dfs(row-1,col,path);
			swamp[row][col]=1;
		}
		
		if(swamp[row-1][col+1]==1)
		{
			swamp[row][col]=-1;
			dfs(row-1,col+1,path);
			swamp[row][col]=1;
		}
		if(swamp[row][col+1]==1)
		{
			swamp[row][col]=-1;
			dfs(row,col+1,path);
			swamp[row][col]=1;
		}
		if(swamp[row+1][col+1]==1)
		{
			swamp[row][col]=-1;
			dfs(row+1,col+1,path);
			swamp[row][col]=1;
		}
		if(swamp[row+1][col]==1)
		{
			swamp[row][col]=-1;
			dfs(row+1,col,path);
			swamp[row][col]=1;
		}
		if(swamp[row+1][col-1]==1)
		{
			swamp[row][col]=-1;
			dfs(row+1,col-1,path);
			swamp[row][col]=1;
		}
		if(swamp[row][col-1]==1)
		{
			swamp[row][col]=-1;
			dfs(row,col-1,path);
			swamp[row][col]=1;
		}
		if(swamp[row-1][col-1]==1)
		{
			swamp[row][col]=-1;
			dfs(row-1,col-1,path);
			swamp[row][col]=1;
		}
	}	
}
