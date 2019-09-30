class Area1
{ double r;
  void Accept(double r1)
  {
      r=r1;
    }
    double calArea()
    {
        double a;
        a= Math.PI*r*r;
        return a;
    }
    void print()
    {
        System.out.println(r+"\t"+ calArea());
    }
    public static void main(String args[])
    {
        Area1 A =new Area1();
        A.Accept(7.0);
        A.print();
    }
}