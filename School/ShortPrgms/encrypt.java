import java.io.*;
class encrypt
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
     String s;
     System.out.println("enter a string");
     s=br.readLine();char ch,ch1='a';String s1="";
     for(int i=0;i<s.length();i++) 
     {   ch=s.charAt(i);
         if(!Character.isLetter(ch))
         continue; 
         if(((int)ch+13)>90)
         ch1=(char)(64+((int)ch+13-90));
         if(((int)ch+13)>122)
         ch1=(char)(96+((int)ch+13-122));
         else
         ch1=(char)((int)ch+13);
         s1=s1+ch1;
        }
     System.out.println(s1);
    }
}
         