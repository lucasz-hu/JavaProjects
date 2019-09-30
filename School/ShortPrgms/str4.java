//to check if the string is a pallindrone
import java.io.*;
class str4
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
    if(s.equalsIgnoreCase(s1))
    System.out.println("pallindrome word");
}
}
         