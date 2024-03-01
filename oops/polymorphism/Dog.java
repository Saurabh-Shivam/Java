package oops.polymorphism;

public class Dog extends Pet {
	
	    String name = "Dobby";
	
        public void walk() {      // We are overriding the same method
		System.out.println("The dog is walking.");
	}

}
