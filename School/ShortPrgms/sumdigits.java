public class sumdigits
{
    private int x;
    public sumdigits()
    {
        x = 0;
    }
    static int print(int t)
    { if(t==0)
       return t;
       else
       { return (t%10)+print(t/10);
        }
    }     
    public static void main(String args[])
        { sumdigits R=new sumdigits();
          System.out.println(print(1056));
    }
}