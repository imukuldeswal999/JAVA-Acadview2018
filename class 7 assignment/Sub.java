import java.util.Scanner;

class Sub{
	public static void main(String args[]){
		System.out.print("Enter the word = ");
		Scanner d=new Scanner(System.in);
		String str=d.nextLine();
		
		
		for (int i=0;i<str.length();i++)
		{
        for (int j = i+1; j<=str.length(); j++)
		{
            System.out.println(str.substring(i,j));
        }
    }
	}
	
}

