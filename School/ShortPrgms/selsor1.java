import java.io.*;
class selsor1
{
    public static void main(String args[]) throws IOException
    { BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int i,t=0,k,j,sn=0,ss;
        int a[]=new int[10];
        System.out.println("enter 10 numbers");
        for(i=0;i<10;i++)
        {  a[i]= Integer.parseInt(br.readLine());
        }
        int s=a.length;
        for(j=0;j<(s-1);j++)
        { sn=a[j];ss=j;
         for(i=j+1;i<s;i++)
         { if(a[i]<sn)
           { sn=a[i];ss=i;
            }
        
        }
        a[j]=t;t=a[j];a[j]=sn;
    }
    if(sn!=j)
    { t=sn;
      sn=a[j];
      a[j]=t;
      
    }
}
}