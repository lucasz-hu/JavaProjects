//to count the occurances of a
import java.io.*;
class str5
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1="",s2;
     int i,k,u=0;char ch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     for(k=i-1;k>=0;k--)
     { ch=s.charAt(k);
       
       u++;
    }
    System.out.println(u);
    
}
}
         