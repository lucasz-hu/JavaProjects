class recur1
{   static int a[]={ 8,9,23,1,4};
    void fun(int a,int n)
    {
        if(a<=n)
        { if(a%2==0)
            {
                System.out.println(a);
                fun(a+2,n);
            }
            else
                fun(a+1,n);
        }
    }

    static int fact(int n) {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    //print numbers from n to 100
    static void ntohund(int n) {
        if(n<=100){

            ntohund(n+1);System.out.println(n);
        }
    }

    static void nto1(int n) {
        if(n>=1) {
            System.out.println(n); 
            nto1(n-1);
        }
    }

    static void printdig(int n) {
        if(n!=0) {
            printdig(n/10);
            System.out.println(n%10);

        }
    }

    static void arrayop(int n) {
        if(n>=1) {

            System.out.println(a[n-1]);arrayop(n-1);
        }
    }

    static void stringop(String n) {
        if(!(n.equals(""))) {
            System.out.println(n.charAt(0));
            stringop(n.substring(1));
        }
    }

    /*void Display()
    {
    //fun(1,20);
    fact(5);
    }
     */
    public static void main() {
        recur1 R=new recur1();
        stringop("helloallah");
    }
}