class Animal{
   
String breed;
String colour;

void speak(String x,String y){

   breed=x;
   colour=y;

System.out.println(breed);
System.out.println(colour);
}


}


class Dog extends Animal{

String breed;
String colour;


void speak(String k,String l)
{
   breed=k;
   colour=l;

System.out.println(breed);
System.out.println(colour);

System.out.println("Dog Bark");

    
}
}

class Cat extends Animal{

String breed;
String colour;


void speak(String z,String o)
{
   breed=z;
   colour=o;

System.out.println(breed);
System.out.println(colour);

System.out.println("Meaw");

    
}
}


class test{
public static void main(String args[]){

   Animal obj1=new Animal();
   Dog obj2=new Dog();
   Cat obj3=new Cat();

  obj1.speak(rat,brown);
  obj2.speak(pug,black);
  obj3.speak(persian,tan);
}
}

  

 