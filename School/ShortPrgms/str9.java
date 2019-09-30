//to convert to opp cases
import java.io.*;import java.util.Scanner;
class str9
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1="",s2;
     int i,k,c,av;char ch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     
     for(k=0;k<i;k++)
     { ch=s.charAt(k);
         if(Character.isLowerCase(ch))
     ch=Character.toUpperCase(ch);
     else
     ch=Character.toLowerCase(ch);
     s1=s1+ch;
    }
    System.out.println(s1);
}}
     

