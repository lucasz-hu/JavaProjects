import java.io.*;
class a1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        int i;
        while(true)
       {System.out.println("Enter any number. enter -999 to exit");
        i=Integer.parseInt(br.readLine());
           if(i==-999)
           break;
        else if(i%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }}}