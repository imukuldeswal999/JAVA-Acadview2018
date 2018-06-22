import java.util.Scanner;
import java.io.*;

class vowel{
public static void main(String args[]){

System.out.print("PLZ ENTER THE STRING  = ");
Scanner s=new Scanner(System.in);
String str=s.nextLine(); 
   
   {
		   String wordNew = str.replaceAll("[aeiouAEIOU]","");
		   
		   System.out.println("THE NEW  WORD IS = " + wordNew);
   }
   
}
}



