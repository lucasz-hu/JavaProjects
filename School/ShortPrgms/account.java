class account extends bank
{ double amt;
    account(int amt1,String name2,int accno2,double p2)
    {   super(name2,accno2,p2);
        amt=amt1;
    }

    void deposit(int cash)
    { p=p+cash;
    }

    void withdraw(int cash)
    { p=p-cash;
    }

    void display()
    {   super.display();
        System.out.println("Amount Withdrawn is "+amt+"Balance "+p);
    }
}
