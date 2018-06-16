import java.util.Scanner;

class Armstrong{
public static void main(String args[]){
   int num,arms=0,rem;

System.out.print("please input 3 digit number");
  
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();

   num=x;


  while(num!=0)
{
  rem=num%10;
  arms=arms+(rem*rem*rem);
  num=num/10;
}
if  (x==arms)
{
System.out.println("Armstrong");
}
else
System.out.println("not an armstrong");
}
  }










