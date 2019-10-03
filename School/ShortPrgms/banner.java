import java.util.Scanner;
class banner {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;int largest=0;

        System.out.println("Enter n, the number of teams ");
        n=(new Scanner(System.in)).nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Team "+(i+1));
            a[i]=(new Scanner(System.in)).nextLine();
        }

        largest=a[0].length();
        for(int i=1;i<n;i++)
        { if(a[i].length()>largest)
            { largest=a[i].length();
            }
        }

        for(int i=0;i<largest;i++)
        {   for(int k=0;k<n;k++)
            {
                if(a[k].length()<=i)
                { System.out.print(" \t");
                }
                else if(a[k].length()>i)
                {
                    System.out.print(a[k].charAt(i)+"\t");
                }
            }
            System.out.println();
        }
    }
}