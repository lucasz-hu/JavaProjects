//to print the char which occurs the most
import java.io.*;
class str8
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1="",s2;
     int i,k,c,av,mf;char ch,mch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     s=s.toUpperCase();
     mch='\u0000';mf=0;
         for(av=65;av<=90;av++)
       { c=0;
           for(k=0;k<i;k++)
         {
             ch=s.charAt(k);
             
       if((char)av==ch)
       {
           c++;
           
        }
       
       
         
    }
    if(c>mf)
    { mf=c;
      mch=(char)av;
    
}
}
System.out.println(mch+" occured the most ie "+mf+"times");
}
}

