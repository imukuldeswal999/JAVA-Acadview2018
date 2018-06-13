class Leapcheck{
public static void main(String args[])
{
  int a=1900;

 if(a%400==0)
{
 System.out.print("a given year is leap year");
}
else if(a%100==0)
{
System.out.print("not a Leap Year");
}
else if(a%4==0)
{
 System.out.print("leap year");
}
else
{
  System.out.print("not a leap year");
}
}
}
