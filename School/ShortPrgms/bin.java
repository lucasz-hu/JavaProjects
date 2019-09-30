class bin {
    int n=8,b=0;String s="";
    void convert(int p)
    { 
        if(p!=0)  
        {
         convert(p/2);
        }
        if(p==0)
        System.out.println(b);
    }
    public static void main(String args[]){
        bin B=new bin();
        B.convert(8);
        
    }
}