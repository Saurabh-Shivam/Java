package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		// With the use of and(&) operator
		
		int a = 5;
		int b = 6;
		
		int c = a & b;
		System.out.println(c);
		
		// With the use of or(|) operator
		
		int x = 10;
		int y = 13;
		
		int z = x | y;
		System.out.println(z);
		
		// Use of shift operator
		
		c = b >> 1;  // Right Shift Operator
		System.out.println(c);
		
		z = y << 1;
		System.out.println(z);  // Left Shift Operator

	}

}



