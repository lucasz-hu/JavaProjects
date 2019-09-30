import java.util.*;
class ArrayShortcuts
{   public static void main()
    { Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");String s=sc.nextLine();
    String a[]=s.split(" ");
    int p[][]=new int[2][2];
    for(int y=0;y<2;y++)
    {for(int j=0;j<2;j++)
        { p[y][j]=sc.nextInt();
            }
        }
    Arrays.sort(p);
    for(int y=0;y<2;y++)
    {for(int j=0;j<3;j++){
        System.out.println(p[y][j]);
            }}
}
}
    