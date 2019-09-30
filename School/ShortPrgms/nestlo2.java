import java.io.*; 
class nestlo2
{  public static void main(String args[]) throws IOException
    { BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int i,t,k;
        for(i=8;i>=2;i-=2)
        {
            for(k=i;k<=8;k+=2)
            { System.out.print(k);
            }
            System.out.println("");
        }}}
   