import java.util.Scanner;
class goldbach {
    Scanner sc=new Scanner(System.in);
    int n;
    void Accept() {
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n<=9 || n>=50 || n%2!=0) {
            System.out.println("Invalid output");
            System.exit(0);
        }
    }

    boolean checkprime(int no) {
        boolean f=false;
        int c=0;
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            c++;
        }
        if(c==2)
            return true;
            else
            return false;
    }

    void Gold() {
        for(int i=0;i<=(n/2);i++) {
            if(checkprime(i) && checkprime(n-i)) {
                System.out.println(i+","+(n-i));
            }
        }
    }
    
    public static void main(String args[]) {
        goldbach G=new goldbach();
        G.Accept();
        G.Gold();
    }
}