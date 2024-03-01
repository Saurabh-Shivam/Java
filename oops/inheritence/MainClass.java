package oops.inheritence;

public class MainClass {

	public static void main(String[] args) {

         /* Teacher t = new Teacher();
          
          t.name = "Mr.Harry";
          
          t.eat();
          t.teach();
          
          Singer s = new Singer();
          
          s.name = "Maria";
          
          s.sing();
          s.eat(); 
          
          
          Teacher t = new Teacher(); */ // Upcasting or Implicit Casting
        //  Person p = t; 
          
          Teacher t1 = new Teacher("Mr.Hola"); // Downcasting or Explicit Casting
          
          Singer s1 = new Singer("Mrs.Hola");
          
          Person p = t1;  
          
          Teacher t = (Teacher)p;
          
          boolean b = t1 instanceof Teacher;
          
          System.out.println(t1 instanceof Teacher);
          System.out.println(s1 instanceof Singer);
          System.out.println(t1 instanceof Person);
          
          System.out.println(t instanceof Person);
          System.out.println(p instanceof Singer);
          System.out.println(p instanceof Teacher); 
          
          System.out.println("Example of how will super constructor execute is given below:-");
		
		Teacher t2 = new Teacher("Mr.Harry");
		//t2.eat(); 
          
   }

}
