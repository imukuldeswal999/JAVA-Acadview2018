import java.util.Scanner;

class u{
public static void main(String args[]){

int i;
System.out.print("plz enter the no. which u want to choose");

Scanner d=new Scanner(System.in);
int num=d.nextInt();

int arr[]={1,4,6,7,8,9,10};
int count=0;
for(i=0;i<arr.length;i++)
{


 if(arr[i]==num)
count++;
}
if (count==1)
System.out.println("present" + i);
else 

System.out.println("not present");

}
}