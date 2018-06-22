import java.util.Scanner;

class reverse{
public static void main(String args[]){
	
	 
	String rev="";
	
	System.out.print("Enter the String to reverse = ");
	Scanner s=new Scanner(System.in);
	String x=s.nextLine();
	 
	 StringBuffer e=new StringBuffer(x);
	 for(int i=x.length()-1;i>=0;i--)
	 {
		rev=rev + x.charAt(i);
	 }    
System.out.println("The reverse string is = " + rev);
	
}
}



