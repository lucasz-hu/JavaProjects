//To find sum of two objects and store it in another
import java.util.Scanner;
class methretobj
{ Scanner sc=new Scanner(System.in);
  int no;
methretobj()
 { no=0;
    }
  void Accept()
  { System.out.println("Enter a number");
    no=sc.nextInt();
}
methretobj Add(methretobj X)
{ methretobj Z=new methretobj();
  Z.no=no+X.no;
  return Z;
}
void Display()
{ System.out.println("Sum is "+no);
}
public static void main(String args[])
{ methretobj A1=new methretobj();
  methretobj A2=new methretobj();
  methretobj A3=new methretobj();
  A1.Accept();
  A2.Accept();
  A3=A1.Add(A2);
  A3.Display();
}
}
  