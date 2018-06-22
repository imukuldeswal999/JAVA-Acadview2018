import java.util.*;

class Common{
	public static void main(String args[]){
		
		HashSet<String> sc=new HashSet<String>();
		sc.add("Rahul");
		sc.add("Mukul");
		sc.add("Aditya");
		sc.add("Nitika");
		sc.add("Sonam");
      System.out.println("HashSet 1 Elements are = " + sc);
	  
	  
	 HashSet<String> d=new HashSet<String>();
	 d.add("Mukul");
	 d.add("Sonam");
	 System.out.println("HashSet 2 Elements are = " + d);
	 
	 sc.retainAll(d);
	 System.out.println("Hashset common elements are  = " + sc);
	}
}

