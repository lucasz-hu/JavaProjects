public class recsum
{
    private int x;
    public recsum()
    {
        x = 0;
    }
    static int print(int t)
    { if(t==100)
       return t;
       else
       { if(t%2==0)
       return t+print(t+2);
       else
       return 0+print(t+1);
        }
    }     
    public static void main(String args[])
        { recsum R=new recsum();
          System.out.println(print(1));
    }
}