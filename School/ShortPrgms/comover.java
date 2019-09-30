import java.io.*;
class comover
{ int i,j,ln,sn,lav;
  String s,ss;
  char ch,chh;
  void compare(int i1, int i2)
  { i1=i;
    i2=j;
    ln=Math.max(i1,i2);
    sn=Math.min(i1,i2);
    System.out.println("sqlno="+ln*ln);
    System.out.println("cusno="+sn*sn*sn);
}
 void compare(char ch1, char ch2)
 { ch1=ch;
   ch2=chh;
   lav=Math.max((int)ch1, (int)ch2);
   System.out.println("lav="+(char)lav);
}
void compare(String s1, String s2)
{ s1=s;
  s2=ss;
  if(s1.length()>s2.length())
  System.out.println(s1);
  else
  System.out.println(s2);
}
}
    