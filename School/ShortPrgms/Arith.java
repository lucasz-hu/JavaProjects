class Arith
{ int a; double b;
    Arith(int a1, double b1)
    { a=a1; b=b1;
    }
    Arith(int a1)
    { a=a1;
      b=5.0;
    }
    Arith(double b1)
    { b=b1;
      a=4;
    }
    int calAdd()
    {
        int s;
        s=a+(int) b;
        return s;
    }
    void Display()
    {
        System.out.println(a+"\t"+b+"\t"+ calAdd());
    }
    public static void main(String args[])
    {
        Arith A=new Arith(50,60.0);
        Arith A1=new Arith(20);
        Arith A2=new Arith(10.0);
        A.Display();
        A1.Display();
        A2.Display();
        
    }
}
  