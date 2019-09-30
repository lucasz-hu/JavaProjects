import java.io.*;
class disarium
{  BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
    int n;
    disarium()
    {n=0;
    }
    void accept()throws IOException
    { System.out.println("enter a number");
      n=Integer.parseInt(br.readLine());
    }
    double powerdigit(int n1)
    { double s=0.0; int r;
      int no=n1;int c=1;
      while(no!=0)
      { r=no%10;
        s=Math.pow(r,c);
        no=no/10;c++;
    }
    return s;
    }
    boolean checkdisarium(int n1)
    { boolean f;
      if(n1==powerdigit(n1))
      return true;
      else
      return false;
    }
    void display()
    { for(int i=1;i<n;i++)
        { if(checkdisarium(i))
            System.out.println(i+" is a disarium number");
        }
    }
    public static void main(String args[])throws IOException
    { disarium D=new disarium();
     D.accept();
     D.display();
    }
}
     