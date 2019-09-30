import java.io.*;
class binserhum
{ public static void main(String args[]) throws IOException
    { int low,mid,hi,m,i;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int a[]=new int[101];
      for(i=0;i<101;i++)
      { a[i]=i;
        }
      System.out.println("Enter the element which has to be searched for");
      m=Integer.parseInt(br.readLine());
      low=0; hi=100;
      while(low<=hi)
      { mid=(low+hi)/2;
          if(m>a[mid])
          { low=mid+1;
            }
        if(m==a[mid])
        {   System.out.println("element found is"+m+"at"+(mid+1)); break;
            }
        if(m<a[mid])
        { hi=mid-1;
        }
        System.out.println("High"+hi+"Mid"+mid+"Low"+low);
    }
    if(low>hi)
    System.out.println("invalid");
    
}
}            