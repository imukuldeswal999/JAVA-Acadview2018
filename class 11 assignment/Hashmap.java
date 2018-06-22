import java.util.*;

class Hashmap{
	public static void main(String argss[]){
		
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(1,"Rahul");
	h.put(2,"Mukul");
	h.put(3,"Sagar");
	h.put(45,"Loveleen");
	
	Set p=h.entrySet();
	Iterator i=p.iterator();
	
	while(i.hasNext())
	{
		Map.Entry z=(Map.Entry)i.next();
		System.out.println("" + z.getKey() +" " + "" + z.getValue());
		
		
	}
	}
}


