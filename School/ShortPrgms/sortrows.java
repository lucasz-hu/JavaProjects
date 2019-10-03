import java.util.Scanner;
class sortrows {
    Scanner sc=new Scanner(System.in);
    int n;

    public static void main(String args[]) {
        int a[][]={{4,7,1,3},{9,4,5,8},{9,7,1,3}};int t=0;
        for(int i=0;i<3;i++)
        { for(int k=0;k<4;k++)
            {    System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++)
        { for(int k=1;k<4;k++)
            {    if(a[i][k]<a[i][k-1])
                {   t=a[i][k-1];
                    a[i][k-1]=a[i][k];
                    a[i][k]=t;
                }
                System.out.println();
            }
        }
        
        for(int i=0;i<3;i++)
        { for(int k=0;k<4;k++)
            {    System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
    }
}
