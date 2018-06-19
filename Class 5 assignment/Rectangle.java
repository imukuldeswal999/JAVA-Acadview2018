import java.util.Scanner;

class Rectangle{
int length;
int breadth;

void definelength()
{
      System.out.println("Enter the value of length=" );
           Scanner d=new Scanner(System.in);
           int x=d.nextInt();
                
               length=x;

}


void definebreadth()
{
       System.out.println("Enter the value of breadth=");
             Scanner k=new Scanner(System.in);
                int y=k.nextInt();

                  breadth=y;

}


void calculatearea()
{
       int area=length*breadth;
System.out.println("Area is = "  + area);
}

public static void main(String args[]){

Rectangle r=new Rectangle();
r.definelength();
r.definebreadth();
r.calculatearea();

}
}
