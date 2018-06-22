import java.util.Scanner;
import java.lang.String;
class Wordscount{
	
	public static void main(String args[]){
		System.out.println("Enter the Sentence = ");
		Scanner d=new Scanner(System.in);
		String x=d.nextLine();
		
		String[] wr= x.split(" ");
		System.out.println(wr.length);
	}
}
}
