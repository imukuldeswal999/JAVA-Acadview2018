abstract class animal{
	    String breed;
		String color;
		String name;
		
	abstract void eat();
	
	void speak(){
		
		System.out.print("Growl");
		
	}
}

class cat extends animal{
	
	public void print(String x,String y,String z){
		
	    breed=x;
		color=y;
		name=z;
	
	System.out.println("Breed is = " + breed);
	System.out.println("Color is = " + color);
	System.out.println("name is = " + name);

	}
	
	void eat(){
		System.out.println("eats pedigree");
		
	
}
}


public class Abstr{
	
	public static void main(String args[]){
		
		animal a=new cat();
		cat b=new cat();
		
	a.speak();
	b.print("persian","brown","brunii");
	b.eat();
	}
}

	
	

	
	
	
		
		


