import java.io.*;
class nesloo2_3
{ public static void main(String args[]) throws IOException
    { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,s,k;s=10;
        for(i=7;i>=1;i-=2)
        {   for(int t=1;t<=s;t++)
            {System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            { System.out.print("*");
            }
            s=s+1;
            System.out.println("");
        }
        s-=2;
        for(i=3;i<=7;i+=2)
        {  for(int t=1;t<=s;t++)
            { System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            { System.out.print("*");
            }
            s=s-1;
            System.out.println("");
        }
    }
}