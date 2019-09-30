class recur2 {
    static int i=1;
    static int sum(int i)
    { if(i==5)
        return 5;
        else 
        return i+sum(i+1);
    }
    static int sumhund(int i) {
        if(i==100)
        return 100;
        if(i%2==0)
        return i+sumhund(i+2);
        else
        return 0+sumhund(i+1);
    }
    static int sumn(int i, int n)
    { if(i==n)
        return n;
        else 
        return i+sumn(i+1,n);
    }
    static int sumn1(int n)
    { if(n==1)
        return 1;
        else 
        return n+sumn1(n-1);
    }
    
    
    
    
    
    
    
    public static void main(String args[]) {
       recur2 R=new recur2();
       System.out.println(R.sumn1(5));
    }
}
    