  import java.util.*;
class linkedlist {
    node start;
//creating node and adding it to the end    
    void InsertEnd(int n) {
        node temp=start;
        while(temp.link!=null) {
            temp=temp.link;
        }
        temp.link=new node(null,n);
    }
//creating node and adding it to the front
    void InsertBegin(int n) {
        node nptr=new node(null,n);
        if(start==null)
            nptr=start;
        else  {
            nptr.link=start;
            start=nptr;
        }
    }

    void count() {
        int c=0;
        node temp=start;
        while(temp!=null)
        {   c++;
            temp=temp.link;
        }
        System.out.println(c);
    }

    void sum() {
        int s=0;
        node temp=start;
        while(temp!=null)
        {   s=s+temp.data;
            temp=temp.link;
        }
        System.out.println(s);
    }

    void search(int n) {
        boolean f=false;int c=1;
        node temp=start;
        while(temp!=null)
        { if(temp.data==n){
                f=true;break;
            }
            temp=temp.link;c++;
        }
        if(f) {
            System.out.println("Found in"+c);
        }
        else
            System.out.println("Not found");
    }

    void display() {
        node temp=start;
        while(temp!=null)
        { System.out.print(temp.data+" ");
            temp=temp.link;
        }
        System.out.println();
    }

    public static void main(String args[])
    { linkedlist L=new linkedlist();int ch;int n;
        while (true)
        {
            System.out.println("1. Insert Begin");
            System.out.println("2. Insert End");
            System.out.println("3. Count");
            System.out.println("4. Sum");
            System.out.println("5. Search");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print("Enter your choice >>");
            ch=(new Scanner(System.in)).nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter insert value ");
                n=(new Scanner(System.in)).nextInt();
                L.Insertfront(n);
                break;
                case 2:
                System.out.println("Enter insert value ");
                n=(new Scanner(System.in)).nextInt();
                L.InsertEnd(n);
                break;
                case 3:
                L.count();
                break;
                case 4:
                L.sum();
                break;
                case 5:
                System.out.println("Enter no. you want to find");
                n=(new Scanner(System.in)).nextInt();
                L.search(n);
                break;
                case 6:
                L.display();
                break;
                case 7:
                System.exit(0);
                break;
                default:
                System.out.println("Wrong Choice");
            }
        }
    }

    void Insertfront(int n) {
        node nptr=new node(null,n);
        if(start==null)
            start=nptr;
        else {
            nptr.link=start;
            start=nptr;
        }
    }
}