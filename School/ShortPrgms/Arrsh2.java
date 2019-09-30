import java.util.*;
class Arrsh2 {
    public static void main(String args[]) {
 String [] stringArray = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};
        
 System.out.println("****** Unsorted String Array *******");
for (String str : stringArray) {
    System.out.println(str);
}
Arrays.sort(stringArray);
System.out.println();
System.out.println(Arrays.toString(stringArray));
}
}