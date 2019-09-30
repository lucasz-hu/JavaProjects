import java.io.*;
class sor1
{
    public static void main(String args[]) throws IOException
    { BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int i,t,k;
        int a[]=new int[10];
        System.out.println("enter 10 numbers");
        for(i=0;i<10;i++)
        {  a[i]= Integer.parseInt(br.readLine());
        }
        int s=a.length;
          for(k=0;k<s;k++)
        { for(i=1;i<(s-k);i++)
        { if(a[i-1]>a[i])
            {
                t=a[i-1];
                a[i-1]=a[i];
                a[i]=t;
            }}
        }
        for(i=0;i<10;i++)
        { System.out.println(a[i]);
        }
    }}