
/**
 * Write a description of class recur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recur
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class recur
     */
    public recur()
    {
        // initialise instance variables
        x = 0;
    }

    public void print(int t)
    { if(t<=100)
        { 
            if(t%2==0)
            {
                System.out.println(t);
                print(t+2);
            }
            else
                print(t+1);
        }
    }

    public static void main(String args[])
    { recur R=new recur();
        R.print(63);
    }
}