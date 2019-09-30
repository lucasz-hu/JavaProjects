//to shift each char by2
import java.io.*;
class str10
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1="",s2;
     int i,k,av,t;char ch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     s=s.toUpperCase();

           for(k=0;k<i;k++)
         {
             ch=s.charAt(k);
             
       if(ch=='Y')
       ch='A';
       else if(ch=='Z')
       ch='B';
       else
       { t=(int)ch;
         t=t+2;
         ch=(char)t;
        }
       s1=s1+ch;
    }

System.out.println(s1);
}
}   