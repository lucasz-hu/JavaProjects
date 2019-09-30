import java.util.Scanner;
class Stringlength
{   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        String s1=s;int i, j=0;int c=0;
        for(i=0;i<s1.length();i++)
        { if(s1.charAt(i)==' ')
                c++;
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
        int n = a.length; 
        for (i = 0; i < n-1; i++) 
        { 
            int minidx = i; 
            for (j = i+1; j < n; j++) 
                if (a[j].length() > a[minidx].length()) 
                    minidx = j; 
            String temp = a[minidx]; 
            a[minidx] = a[i]; 
            a[i] = temp; 
        } 
        for(i=0;i<c;i++)
            System.out.print(a[i]+" ");
    } 
    }


