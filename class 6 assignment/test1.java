interface Animal{

void speak();
void eat();

}

class Dog implements Animal{

public void speak(){

System.out.println("Dog's Bark");

}

public void eat(){

System.out.println("Dog eats Pedigree");
}
}

class Cat implements Animal{

public void speak()
{
System.out.println("Meaw");
}

public void eat(){
System.out.println("Cat drinks milk");
}
}


public class test1{
public static void main(String args[]){

Dog d1=new Dog();
d1.speak();
d1.eat();

Cat c1=new Cat();
c1.speak();
c1.eat();

}

}
