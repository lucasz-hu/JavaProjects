
class binary {
    int a[]={4,5,6,7,2};
    int no=7;
    boolean search(int no,int i)
    {
        if(a[i]==no)
        { System.out.println("Found, subscript="+i);
          return true;
        }
        else {
            return search(no, i+1);
        }
    }

    public static void main(String args[])
    {
        binary b=new binary();
        b.search(7,0);
    }
}

    