//to add time using method returning an object
import java.util.Scanner;
class methretobj2
{ Scanner sc=new Scanner(System.in);
  int hr,m;
methretobj2()
 { hr=0;m=0;
    }
  void Accept()
  { System.out.println("Enter hours");
    hr=sc.nextInt();
    System.out.println("Enter minutes");
    m=sc.nextInt();
}
methretobj2 AddTime(methretobj2 X, methretobj2 Y)
{ methretobj2 Z=new methretobj2();
   
  return Z;
}
void Display()
{ System.out.println("Sum is "+no);
}
public static void main(String args[])
{ methretobj2 A1=new methretobj();
  methretobj2 A2=new methretobj();
  methretobj2 A3=new methretobj();
  A1.Accept();
  A2.Accept();
  A3=A1.AddTime(A2);
  A3.Display();
}