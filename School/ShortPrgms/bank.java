class bank
{ String name;int accno;double p;
  bank(String name1,int accno1,double p1)
  { name=name1;
      accno=accno1;
      p=p1;
    }
  void display()
  { System.out.println("Name: "+name+"Account Number: "+accno+"Amount: "+p);
    }
}