public class fibo
{
    private int x;
    public fibo()
    {
        // initialise instance variables
        x = 0;
    }

    public void print(int t)
    {if(t<100){ 
            x=x+t;
            System.out.println(x);
            print(t);
        }
    }

    public static void main(String args[])
    { fibo R=new fibo();
        R.print(1);
    }
}