import java.lang.String;
import java.util.Scanner;
 
class Occ{
   public static void main(String args[]){
   
      Scanner d= new Scanner(System.in);
      System.out.println("Enter the first string");
      String s1=d.nextLine();
 
      System.out.println("Enter the second string");
      String s2=d.nextLine();
 
      boolean s=s1.contains(s2);
		if (s==true)
            System.out.println("String1 content is present in String2");
else
   System.out.println("String1 content is not present in string2");
	
		
   }
}

