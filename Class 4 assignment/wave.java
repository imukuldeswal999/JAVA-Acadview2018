import java.util.Scanner;

class wave{
public static void main(String args[]){
int temp=0;

int arr[]=new int[10];

 
for(int i=0;i<arr.length;i++)
{
Scanner d=new Scanner(System.in);
int x=d.nextInt();

 arr[i]=x;
}

for(int j=0;j<arr.length-1;j=j+2)
{
  if(arr[j]>arr[j+1])
   temp=arr[j];
   arr[j]=arr[j+1];
   arr[j+1]=temp;
}
for(int k=0;k<arr.length;k++)
{
System.out.print(arr[k]+ " ");
}
}
}

 

