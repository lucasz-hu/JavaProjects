import java.util.*;
class CountW {
 public static void main(String args[]) {
     System.out.println("Enter");
     String s=(new Scanner(System.in)).nextLine();
     String a[]=s.split(" ");
     Arrays.sort(a,Collections.reverseOrder());
     System.out.println(Arrays.toString(a));
    }
}