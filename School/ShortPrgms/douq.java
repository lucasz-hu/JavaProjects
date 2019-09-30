import java.io.*;
class douq
{ public static void main()throws IOException
  { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int a[]=new int[5];
    int f=-1;int r=0; int i=0;int ch=0,n;
    System.out.println(" deletefr insertback delback insfr exit");
    ch=Integer.parseInt(br.readLine());
    while(true)
    { switch(ch)
        { case 1:
          if(r>f)
          System.out.println("stack underflow");
          else
          System.out.println("the deleted element is "+a[f++]);
          break;
          case 2:
          System.out.println("enter n");
          n=Integer.parseInt(br.readLine());
          if(r==4)
          {System.out.println("queue overflow");}
          else
          a[++r]=n;
          break;
          case 3:
          if(f>r)
          System.out.println("quque underflo");
          else
          System.out.println("the deleted element is"+a[r--]);
          break;
          case 4:
          System.out.println("enter n");
          n=Integer.parseInt(br.readLine());
          if(f==-1 && r==0)
          a[++r]=n;
          else if(f!=-1)
          a[--f]=n;
          else
          System.out.println("insertion not possible");
          break;
          case 5:
          System.exit(0);
          default:
          System.out.println("try again");
        }
    }
}
}

         