
import java.io.*;
public class palin
{
    public static void main(String args[])throws IOException
    {        
        int n,n1,rn,r;
        rn=0;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a number");
         n=Integer.parseInt(br.readLine());
         n1=n;
         while(n1!=0)
         {
             r=n1%10;
             rn=rn*10+r;
             n1=n1/10;
            }
            if(rn==n)
           System.out.println("It is a palindrome");
           else
           System.out.println("It is not a palindrome");
}
}
