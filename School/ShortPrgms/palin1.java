import java.util.Scanner;
public class palin1
{
    int num,revnum;
    public palin1()
    {
        num=0;revnum=0;
    }

    void Accept()
    { System.out.println("enter a number");
      num=(new Scanner(System.in)).nextInt();
    }
    int reverse(int y)
    { if(y!=0)
        { int r=y%10;
          revnum=revnum*10+r;
          reverse(y/10);     
        }
      return revnum;
    }
    void check()
    { if(reverse(num)==num)
       System.out.println("Palindrome");
       else
       System.out.println("not");
    }
       
    public static void main(String args[])
    { palin1 R=new palin1();
      R.Accept();
      R.check();
    }
}