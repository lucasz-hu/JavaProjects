
import java.util.Scanner;
public class TriangleArea
{
    
    public static void main()
    {
        double area,b,h;
        
        Scanner kb1=new Scanner(System.in);
        System.out.println("Enter the base");
        b=kb1.nextDouble();
        Scanner kb2=new Scanner(System.in);
        System.out.println("Enter the height");
        h=kb2.nextDouble();     
        area=0.5*b*h;        
        System.out.println("Base of the triangle"+b);
        System.out.println("Height of the triangle"+h);
        System.out.println("Area of the triangle"+area);
        
        }
    }
        
