import java.io.*;
class neslo2_2
{ public static void main(String args[]) throws IOException
    { BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int i,t,s,k;s=39;
        for(i=1;i<=7;i+=2)
        { for(t=1;t<=s;t++)
            { System.out.print(" ");
            } 
            for(k=1;k<=i;k++)
            { System.out.print("*");
            }
            s=s-1;
            System.out.println("");
        }
        s+=2;
        for(i=5;i>=1;i-=2)
        { for(t=1;t<=s;t++)
            {System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            { System.out.print("*");
            }
            s=s+1;
            System.out.println("");
        }
    }
}

