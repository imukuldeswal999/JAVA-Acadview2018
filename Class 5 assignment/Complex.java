import java.util.Scanner;


class Complex{
int real;
int imaginary;

void definereal()
{
      System.out.print("Enter the real value = ");
        Scanner d=new Scanner(System.in);
            int x=d.nextInt();
 
           real=x;
}

void defineimaginary()
{     
          System.out.println("Now,Enter the Imaginary value = ");
        Scanner z=new Scanner(System.in);
         int y=z.nextInt();
 
          imaginary=y;
}

void display()
{
     
System.out.println("Complex Number="+real+"+"+imaginary+"i");
}


public static void main(String args[]){
Complex c=new Complex();
c.definereal();
c.defineimaginary();
c.display();
}
}