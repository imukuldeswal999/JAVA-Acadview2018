import java.util.Scanner;
import java.io.*;

class Patt{
public static void main(String args[]){
	System.out.println("Enter a no. = ");
	Scanner d=new Scanner(System.in);
	int z=d.nextInt();
	    
         
		for(int i=1;i<=z;i++)
		{
		int alphabet=65;
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)alphabet);
		alphabet++;
		}
		System.out.println();
		}
}
}

			
			