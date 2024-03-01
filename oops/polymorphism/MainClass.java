package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Example for run-time polymorphism is given below:-");
		
         Dog d = new Dog();
         
         Pet p = d;   // This is called run-time polymorphism
         Animal a = d;
          
         d.walk();
         p.walk();
         
         System.out.println(d.name);
         System.out.println(p.name);
	
        System.out.println("Example for compile-time polymorphism is given below:-");
         
		greetings();  // This is called complie-time polymorphism
		greetings("Good Morning.");
		greetings("How are you?", 3);
     } 
	
	public static void greetings() {
		System.out.println("Hi, there.");
	}
	

	public static void greetings(String s) {
		System.out.println(s);
	}


	public static void greetings(String s, int count) {
		for(int i = 0; i<count; i++) {
			System.out.println(s);
		}
	}
}
