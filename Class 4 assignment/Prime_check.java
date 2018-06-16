import java.util.Scanner;

class Prime_check{
public static void main(String args[]){
       int count=0;
 Scanner my=new Scanner(System.in);
 int d=my.nextInt();

if(d==0||d==1)
System.out.print("no. not prime");
else
{
  
	for(int  i=2;i<=d;i++)
		{count=2;
			for(int j=2;j<i;j++)
				{

				if(i%j==0)
				count++;
			}	
 			 if(count==2)
				
  			System.out.println(i+" ");
}
 }
}
}