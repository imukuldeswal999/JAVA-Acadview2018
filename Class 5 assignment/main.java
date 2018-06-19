class load{
int x;
float y;

    void declare(){
    System.out.println("null");
    }

        void declare(int k){
	
	        x=k;
        System.out.println(x);
        }
		
		
    void declare(float l){
            
            y=l;
    System.out.println(y);
  
    }
}

public class main{
   public static void  main(String args[]){
        load c=new load();
		load c1=new load();
		load c2=new load();
		
		c.declare();
		c1.declare(5);
		c2.declare(3.56f);
	
   }
}

