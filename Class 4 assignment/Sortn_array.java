class Sortn_array{
public static void main(String args[]){

  int temp,a,b;

 int arr[]={1,1,1,1,0,0,1,0};
for(int i=0;i<arr.length;i++)
{
a=arr[i];
b=arr[i+1];

do
{
 temp=a;
 a=b;
 b=temp;
}
while(a<b);

 for(int j=0;j<arr.length;j++)
{
System.out.print(arr[j]);
}
}
}
}
