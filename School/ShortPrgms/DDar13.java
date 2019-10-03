import java.io.*;
class DDar13{ 
    public static void main(String args[]) {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]={{1,2,3},{2,4,5},{3,5,6}};
        for(int i=0;i<3;i++) {
            for(int k=0;k<3;k++) {
                System.out.print(a[i][k]);
            }
            System.out.println();
        }
        System.out.println();
        boolean f=true;
        for(int i=0;i<3;i++) {
            for(int k=0;k<3;k++) {
                if(a[i][k]!=a[k][i])
                {  f=false;
                    break;
                }
            }
        }
        if(f)
        System.out.println("Symmetric");int s=0;
        for(int i=0;i<3;i++)
        s=s+a[i][i];
        System.out.println("Left diagonal "+s);
        s=0;
        for(int i=0;i<3;i++)
        s=s+a[i][2-i];
        System.out.println("Right diagonal "+s);
    }
}