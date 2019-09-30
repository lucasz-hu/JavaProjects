//to print the reversed string
import java.io.*;
class str3
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1="",s2;
     int i,k;char ch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     for(k=i-1;k>=0;k--)
     { ch=s.charAt(k);
       s1=s1+ch;
    }
    System.out.println(s1);
}
}
         