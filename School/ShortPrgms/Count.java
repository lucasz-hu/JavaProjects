import java.util.*;
class Count{
    public static void main(String args[])
    {
     System.out.println("Enter");
     int c=1;
     String s=(new Scanner(System.in)).nextLine();
     for(char ch:s.toCharArray())
      if(ch==' ')
      c++;
     System.out.println(c);
}
}

