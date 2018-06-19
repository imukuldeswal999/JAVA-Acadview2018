import java.util.Scanner;

class  convert{
public static void main(String args[]){

String x;
String y;

System.out.print("Enter 1st string = ");
  Scanner s=new Scanner(System.in);
   x=s.nextLine();

  
  System.out.print("Enter 2nd string = ");
   y=s.nextLine();
   
   
   int n=Integer.parseInt(x);
   int z=Integer.parseInt(y);
   
   if(n>z)
	   System.out.println("Integer 1 is greater(String 1 )");
   else
	   System.out.println("	Integer 2 is greater(String 2 )");
   
}
}

