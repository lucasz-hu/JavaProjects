class Area2
{ double s,l,b;
  double r;
    void calArea(double r1 )
    {r=r1;
        System.out.println(Math.PI*r*r);
    }
    void calArea(int s1)
    {s=s1;
        System.out.println(s*s);
    }
    void calArea(int l1,int b1)
    {l=l1; b=b1;
        System.out.println(l*b);
    }
}