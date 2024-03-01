package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {

		// AUTOMATIC TYPECASTING
		
		byte x = 4;
		int y = x;
		System.out.println(y);
		
		int a = 4;
		double b = x;
		System.out.println(a);
		System.out.println(b);

      
		// MANUAL TYPECASTING
		
		double myDouble = 2.8245;
		int myInt = (int)myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);
	}

}
