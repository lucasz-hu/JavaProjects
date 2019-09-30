import java.io.*;
class mod1
{  public static void main(String args[]) throws IOException
    { BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int r,rn=0,n,n1;
        System.out.println("enter a number");
        n=Integer.parseInt(br.readLine());n1=n;
        while(n!=0)
        { r=n%10;
          rn=rn*10+r;
          n=n/10;
        }
        if(rn==n1)
        System.out.println("pallindrome");
    }
}