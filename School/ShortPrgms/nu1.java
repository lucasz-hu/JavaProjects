
public class nu1
{
    public static void main(String args[])
    {
    int a=1, c=0;
    while(++a<=15);
    { a++;
        c++;
      System.out.println(a);
      a+=2;
    }
    System.out.println("counter"+c);
}
{
        int count=0;
        for(int i=0;i<3;i++)
        resume:
        for(int j=0;j<4;j++)
        for(int k=0;k<5;k++)
        {
            ++count;
            if (i==1 && j==2 && k==3)break resume;
        }
        System.out.println("\tcount="+count);
    }
}