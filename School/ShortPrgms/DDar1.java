import java.io.*;
class DDar1
{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int i,k;
  int a[][]=new int[][]{{11,12,13,14},{16,18,20,22},{25,26,28,29}};
  void Accept()throws IOException
  { for(i=0;i<3;i++)
      {for(k=0;k<4;k++)
          { System.out.println("Enter a number");
            a[i][k]=Integer.parseInt(br.readLine());
            }
    }
}
  void Display1()//original array
  { for(i=0;i<3;i++)
      {for(k=0;k<4;k++)
          { System.out.print(a[i][k]);
            }
       System.out.println("");
    }
}
 void Display2()
  { for(i=0;i<4;i++)
      {for(k=0;k<3;k++)
          { System.out.print(a[k][i]+" ");
            }
       System.out.println("");
    }
}
void Display3()
  { for(i=0;i<3;i++)
      {for(k=3;k>=0;k--)
          { System.out.print(a[i][k]+" ");
            }
       System.out.println("");
    }
}
void Display4()
  { for(i=0;i<4;i++)
      {for(k=2;k>=0;k--)
          { System.out.print(a[k][i]+" ");
            }
       System.out.println("");
    }
}
 void Display5()
  { for(i=2;i>=0;i--)
      {for(k=3;k>=0;k--)
          { System.out.print(a[i][k]+" ");
            }
       System.out.println("");
    }
}
 void Display6()
  { for(i=3;i>=0;i--)
      {for(k=2;k>=0;k--)
          { System.out.print(a[k][i]+" ");
            }
       System.out.println("");
    }
}
 void Display7()
  { for(i=0;i<3;i++)
      System.out.println(a[i][i]);
    }
    void Display8()
  { for(i=0;i<3;i++)
      System.out.println(a[i][2-i]);
    }
     void Display9()
  { for(i=0;i<3;i++)
      {for(k=0;k<4;k++)
          { if(i==0 || i==2 ||k==0 || k==3)
             System.out.print(a[i][k]+" ");
             else
             System.out.print("  ");
            }
       System.out.println("");
    }
}
public static void main(String args[])throws IOException
{ DDar1 D=new DDar1();
  D.Display1();
  D.Display2();
  D.Display3();
  D.Display4();
  D.Display5();
  D.Display6();
  D.Display7();
  D.Display8();
  D.Display9();
}
}