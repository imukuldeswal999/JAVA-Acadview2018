import java.util.Scanner;

class Usr_reverse{
public static void main(String args[]){

System.out.print("Plz enter the number which u want to reverse");
int temp,rem,rev=0;

Scanner d=new Scanner(System.in);
int x=d.nextInt();
 temp=x;

 while(temp!=0)
{
 rem=temp%10;
 rev=rev*10+rem;
 temp=temp/10;
 }
{
System.out.print(rev);
}
}
}