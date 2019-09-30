//to find the freq of each letter
import java.io.*;
class str7
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s,s1="",s2;
     int i,k,c,av;char ch;
     System.out.println("enter a string");
     s=br.readLine();
     i=s.length();
     s=s.toUpperCase();
     
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
    if(c>0)
    System.out.println("Letter   "+(char)av+"Frequency   "+c);
    
}

}
}

