class Animal{
   
String breed;
String colour;

void speak(String x,String y){

   breed=x;
   colour=y;

System.out.println("The breed of Animal is = " + breed);
System.out.println("The colour of Animal is = " + colour);

System.out.println("Animal's Sleep");
}


}


class Dog extends Animal{

String breed;
String colour;


void speak(String k,String l)
{
   breed=k;
   colour=l;

System.out.println("The breed of dog is = " + breed);
System.out.println("The colour of dog is = " + colour);

System.out.println("Dog's Bark");

    
}
}

class Cat extends Animal{

String breed;
String colour;


void speak(String z,String o)
{
   breed=z;
   colour=o;

System.out.println("The breed of cat is = " + breed);
System.out.println("The colour of cat is = " + colour);

System.out.println("Cat's Meaw");

    
}
}


public class Test{
public static void main(String args[]){

   Animal obj1=new Animal();
   Dog obj2=new Dog();
   Cat obj3=new Cat();

  obj1.speak("rat","brown");
  obj2.speak("pug","black");
  obj3.speak("persian","tan");
}
}

  

 