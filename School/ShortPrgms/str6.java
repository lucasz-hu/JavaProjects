//to arrange the string in ascending order
import java.io.*;
class str6
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1="",s2;
     int i,k,av;char ch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     
         for(av=65;av<=90;av++)
       { 
           for(k=0;k<i;k++)
         {
             ch=s.charAt(k);
             
       if((char)av==ch)
       {
           s1=s1+ch;
           System.out.println("values are"+ch);
        }
       // else
       // {System.out.println("I am in the else loop to compare"+(char)av+""+ch);
         
    }
}
System.out.println("ascending="+s1);
}
}
