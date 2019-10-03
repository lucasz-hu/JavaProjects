import java.util.Scanner;
class Boxes {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;int y;
        System.out.println("Enter a number, to pack into boxes");
        n=sc.nextInt();int n1=n;
        for(int m=48;m>=6;m=m/2)
        { y=n1/m;
            if(y<1)
            { System.out.println("0 X "+m+" = "+(m*y));
                if(m==6)
                { System.out.println("Remainder = "+(n1-(m*y)));
                }
            }
            else
            { System.out.println(m+" X "+y+" = "+(m*y));
                n1=n1-(m*y);
            }
        }
    }
}
