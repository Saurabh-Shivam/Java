package methods;

public class Introduction {

	public static void main(String[] args) {

      int firstNumber = 34;
      int secondNumber = 23;
      
      int result = maxOf(firstNumber, secondNumber);
      
      maxOf(100, 200);   // Calling of a method.
      
      maxOf(3, 4);
      
      System.out.println(result);
      
      sayHi();
      
      sayHi();
      
      maxOf(5); 
	}
	
	static int maxOf(int a, int b) {
		
		if(a > b)
		return a;       // return a > b? a:b;   ( By using ternary operators)
		else
		return b;
	}
	
	static void sayHi() {
		
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
	
	static void maxOf(float c) {
		
	}

}
