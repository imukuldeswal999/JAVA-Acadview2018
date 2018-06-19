class tree{
	
	static{
		System.out.println("Hello");
	}
	
tree()
{
	System.out.println("tree constructor");
}

}

class peach extends tree{
	
peach()
{
		  System.out.println("peach constructor");
	  }
}

class Stat1{
	public static void main(String ars[]){
		
		peach p1=new peach();
	
	System.out.println("root constructor");
	}
}

