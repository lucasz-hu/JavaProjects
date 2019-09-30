import java.io.*;
class DDar2
{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int i,k;
  int a[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
void Display1()//above left diagonal
{ for(i=0;i<=4;i++)
      {for(k=0;k<=4;k++)
          { if(k>i)
              System.out.print(a[i][k]+" ");
            }
       System.out.println("");
    }
}
void Display2()//above right diagonal
{ for(i=0;i<=4;i++)
      {for(k=0;k<=4;k++)
          { if(k<4-i)
              System.out.print(a[i][k]+" ");
            }
       System.out.println("");
    }
}
public static void main(String args[])
{ DDar2 D=new DDar2();
  D.Display1();
  D.Display2();
}
}