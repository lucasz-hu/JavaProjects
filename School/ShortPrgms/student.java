import java.io.*;
class student
{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int rn,me,mm,mc;
  String n;
  void Inpu() throws IOException
  { System.out.println("Enter roll no");
    rn=Integer.parseInt(br.readLine());
    System.out.println("Enter math marks");
    mm=Integer.parseInt(br.readLine());
    System.out.println("Enter eng marks");
    me=Integer.parseInt(br.readLine());
    System.out.println("Enter comp marks");
    mc=Integer.parseInt(br.readLine());
    System.out.println("Enter name");
    n=br.readLine();
}
double calTot()
{ double d;
  d=mm+me+mc;
  return d;
}
double calAvg()
{ double a;
  a=calTot()/3.0;
  return a;
}
String result()
{
    String s="";
    if(calAvg()>=80)
    s="distinction";
     if(calAvg()>=60 && calAvg()<80)
    s="1 ";
     if(calAvg()>=40 && calAvg()<60)
    s="2";
     if(calAvg()<40)
    s="how man";
    return s;
}
void display()
{
    System.out.println("roll no is"+rn);
    System.out.println("name is"+n);
    System.out.println("marks are"+mm+"\t"+me+"\t"+mc+"\t");
    System.out.println("Total"+calTot());
    System.out.println("average"+calAvg());
    System.out.println("result"+result());
}
public static void main(String args[]) throws IOException
{ student A=new student();
  A.Inpu();
  A.display();
}
}
    
    
