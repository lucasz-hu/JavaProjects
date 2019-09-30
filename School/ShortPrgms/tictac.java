import java.io.*;
class tictac
{
    public static void main(String args[]) throws IOException
    { BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int i,t,k;
        int a[]=new int[3];
        int b[]=new int[3];
        int c[]=new int[3];
        while(true)
        {System.out.println("X is your letter");
        System.out.println("enter position rowXcolumn w/o the X ");
        i=Integer.parseInt(br.readLine());
        //to check where users x goes 
        if(i==11)
        {if((a[1-1]==1)||(a[0]==0))
        {System.out.println("invalid");break; } a[1-1]=1;
        }
        if(i==12)
        {if(a[2-1]==1|| a[2-1]==0)
        {System.out.println("invalid");break ;} a[2-1]=1;
        }
        if(i==13)
        {if(a[3-1]==1|| a[3-1]==0)
        {System.out.println("invalid");break; } a[3-1]=1;
        }
        if(i==21)
        { if(b[1-1]==1|| b[1-1]==0)
        {System.out.println("invalid");break; }b[1-1]=1;
        }
        if(i==22)
        {if(b[2-1]==1|| b[2-1]==0)
        {System.out.println("invalid");break; } b[2-1]=1;
        }
        if(i==23)
        {if(b[3-1]==1|| b[3-1]==0)
        {System.out.println("invalid");break; } b[3-1]=1;
        }
        if(i==31)
        { if(c[1-1]==1|| c[1-1]==0)
        {System.out.println("invalid");break; }c[1-1]=1;
        }
        if(i==32)
        { if(c[2-1]==1|| c[2-1]==0)
        {System.out.println("invalid");break; }c[2-1]=1;
        }
        if(i==33)
        {if(c[3-1]==1|| c[3-1]==0)
        {System.out.println("invalid");break; } c[3-1]=1;
        }
        System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]);
         System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]);
         System.out.println(c[0]+"\t"+c[1]+"\t"+c[2]);
        //to reply o user
        if(i==11)
        { c[3-1]=0;
        }
        if(i==21)
        { a[3-1]=0;
        }
        if(i==31)
        { a[1-1]=0;
        }
        if(i==12)
        { b[2-1]=0;
        }
        if(i==22)
        { b[3-1]=0;
        }
        if(i==32)
        { a[2-1]=0;
        }
        if(i==13)
        { b[1-1]=0;
        }
        if(i==23)
        { c[1-1]=0;
        }
        if(i==33)
        { c[2-1]=0;
        }
        if(a[0]==b[0] && b[0]==c[0] && c[0]==1)
        {System.out.println(" you win");break;}
        if(a[0]==b[0] && b[0]==c[0] && c[0]==0)
        {System.out.println(" you lose");break;}
        if(a[1]==b[1] && b[1]==c[1] && c[1]==1)
        {System.out.println(" you win");break;}
        if(a[1]==b[1] && b[1]==c[1] && c[1]==0)
        {System.out.println(" you lose");break;}
        if(a[2]==b[2] && b[2]==c[2] && c[2]==1)
        {System.out.println(" you win");break;}
        if(a[2]==b[2] && b[2]==c[2] && c[2]==0)
        {System.out.println(" you lose");break;}
        if(a[0]==b[1] && b[1]==c[2] && c[1]==1)
        {System.out.println(" you win");break;}
        if(a[0]==b[1] && b[1]==c[2] && c[2]==0)
        {System.out.println(" you lose");break;}
        if(a[2]==b[1] && b[1]==c[0] && c[0]==1)
        {System.out.println(" you win");break;}
        if(a[2]==b[1] && b[1]==c[0] && c[0]==0)
        {System.out.println(" you lose");break;}
         System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]);
         System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]);
         System.out.println(c[0]+"\t"+c[1]+"\t"+c[2]);
    }}
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        