import java.io.*;
class Stringdelete
{ public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        String s;
        System.out.println("enter a string");
        s=br.readLine();String s1="";char ch;
        //delete extra spaces
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==' ' && s.charAt(i+1)==' ') {
                continue;
            }
            else 
                s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        String a[]=new String[10];
        int subscript=0;int c=0;int i=0;
        while(i!=-1)
        {   i=s.indexOf(' ', subscript);
            a[c++]=s1.substring(subscript, i+1);
            subscript=i+1;
        }
        for(i=0;i<=c;i++)
        System.out.println(a[i]);
    }
}