import java.io.*;
class armstrong
{  BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
    int n;
    armstrong()
    {n=0;
    }
    void accept()throws IOException
    { System.out.println("enter a number");
      n=Integer.parseInt(br.readLine());
    }
    int sumsquare(int n1)
    { int s=0; int r;
      int no=n1;
      while(no!=0)
      { r=no%10;
        s=s+r*r*r;
        no=no/10;
    }
    return s;
    }
    boolean checkarmstrong(int n1)
    { boolean f;
      if(n1==sumsquare(n1))
      return true;
      else
      return false;
    }
    void display()
    { for(int i=1;i<n;i++)
        { if(checkarmstrong(i))
            System.out.println(i+" is an armstrong number");
        }
    }
    public static void main(String args[])throws IOException
    { armstrong D=new armstrong();
     D.accept();
     D.display();
    }
}
     