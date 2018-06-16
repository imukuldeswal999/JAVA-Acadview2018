import java.util.Scanner;

class Arr{
public static void main(String args[]){
int temp=0;

int arr[]=new int[10];

 

for(int i=0;i<arr.length;i++)
{
Scanner d=new Scanner(System.in);
int x=d.nextInt();

 arr[i]=x;
}

for(int j=0;j<arr.length;j++)
{
for(int k=0;k<arr.length-1;k++)
{
   if(arr[k]<arr[k+1])
    {
    temp=arr[k+1];
    arr[k+1]=arr[k];
    arr[k]=temp;
    }
}
}
for(int l=0;l<arr.length;l++)
{
System.out.print(arr[l]+" ");
}
System.out.println(" ");
System.out.println(arr[1]);

}
}
