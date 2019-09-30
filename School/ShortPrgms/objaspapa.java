//Parsing an object as a parameter(sum op)
import java.util.Scanner;
class objaspapa
{ int no;
  Scanner sc=new Scanner(System.in);
  objaspapa()
  { no=0;
    }
  void Accept()
  { System.out.println("Enter the number");
    no=sc.nextInt();
}
void Display(objaspapa X)
{ int s;
  s=no+ X.no;
  System.out.println("Sum is "+s);
}
public static void main(String args[])
{ objaspapa A1=new objaspapa();
  objaspapa A2=new objaspapa();
  A1.Accept();
  A2.Accept();
  A1.Display(A2);
}
}
  