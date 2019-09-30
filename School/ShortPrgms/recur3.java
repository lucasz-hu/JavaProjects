public class recur3
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class recur
     */
    public recur3()
    {
        // initialise instance variables
        x = 0;
    }

    void print(int t)
    { if(t!=0)
        {
            System.out.println(t%10);
            print(t/10);
           
        }
      
    }
        public static void main(String args[])
        { recur3 R=new recur3();
        R.print(63);
    }
}