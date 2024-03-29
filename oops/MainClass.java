package oops;

class Cat{
	boolean hasFur;      // These are the properties.
	String color,breed;
	int legs,eyes;
	
	public void walk() {                       // These are the behaviours.
	System.out.println("Cat is walking.");	
}
	
	public void eat() {
	System.out.println("Cat is eating.");
	}
	
	public void description() {
	System.out.println("My cat has " +legs +" legs and " +eyes +" eyes");
	}
}

class Dog{
	String breed, name;
	
	public void jump() {
	System.out.println("My dog " + name +" jumped");
	}
	
	public void description() {
	System.out.println("My dog's name is " + name +" and it's breed is " + breed);
	}
}

public class MainClass {

	public static void main(String[] args) {

	Cat cat1 = new Cat();   // We have created an object here
	Cat cat2 = new Cat();
	
	cat1.walk();
	cat2.eat();
	
	cat1.legs = 3;
	cat1.eyes = 2;
	
	cat2.legs = 4;
	cat2.eyes = 1;
	
	cat1.description();
	cat2.description();
	
	Dog husky = new Dog();
	Dog poodle = new Dog();
	
    husky.breed = "Husky";
    husky.name = "Browny";
    
    poodle.breed = "Poodle";
    poodle.name = "Mr. Moolchand Jii";
    
    husky.description();
    husky.jump();
    
    poodle.description();
    poodle.jump();
    
	}
}
