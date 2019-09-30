import java.io.*;
class linser1
{ public static void main(String args[]) throws IOException
    { int f,f1,i,m;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int a[]=new int[10];
      System.out.println("Enter 10 sorted elements");
      for(i=0;i<10;i++)
      { a[i]=Integer.parseInt(br.readLine());
        }
      System.out.println("Enter the element which has to be searched for");
      m=Integer.parseInt(br.readLine());
      for(i=0;i<10;i++)
      { if(a[i]==m)
          {  System.out.println("element found"+a[i]+"in "+(i+1));
            }
        }
      
    
    }
    
}