//to print one charect per line from the given string
import java.io.*;
class str1
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1,s2;
     int i,k;char ch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     for(k=0;k<i;k++)
     { ch=s.charAt(k);
       System.out.println(ch);
    }
}
}
         