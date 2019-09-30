public class factorial
{
    private int x;
    public factorial()
    {
        x = 0;
    }
    static int print(int t)
    { if(t==1)
       return t;
       else
       { return (t)*print(t-1);
        }
    }     
    public static void main(String args[])
        { factorial R=new factorial();
          System.out.println(print(5));
    }
}