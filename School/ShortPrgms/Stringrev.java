import java.util.Scanner;
class Stringrev
{   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>20)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        for(int v=1;v<=n;v++)
        {
            System.out.println("Enter the string");
            String s=sc.nextLine();
            String s1="";int i, j=0;int c=0;
            for(i=0;i<s.length();i++)
            { if(Character.isLetter(s.charAt(i)) || s.charAt(i)==' ')
                    s1=s1+s.charAt(i);
            }
            int charcounter=0;
            for(i=0;i<s1.length();i++)
            {   charcounter++;
                if(s1.charAt(i)==' ')
                    c++;
            }
            if(charcounter>80)
            { System.out.println("Invalid String");
                System.exit(0);
            }
            c=c+1;
            String a[]=new String[c];int m=0;
            while(i!=-1)
            {   
                i=s1.indexOf(' ', j);
                if(i!=-1)
                {
                    a[m++]=s1.substring(j,i);
                    j=i+1;   
                }
            }
            a[c-1]=s1.substring(s1.lastIndexOf(' ')+1);
            for(i=c-1; i>=0;i--)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}