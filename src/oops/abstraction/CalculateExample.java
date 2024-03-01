package oops.abstraction;

abstract class ABC{
	abstract void get();
}

class XYZ extends ABC{
	int a,b,s,add,prod,sub,div;
	
	void get(int x, int y) {
		a = x;
		b = y;
	}
	void sum() {
		s = a + b;
		System.out.println("Sum = " +add);
	}
	void sub() {
		s = a - b;
		System.out.println("Sum = " +sub);
	}
	void prod() {
		s = a * b;
		System.out.println("Sum = " +prod);
	}
	void div() {
		s = a / b;
		System.out.println("Division = " +div);
	}
	
}

public class CalculateExample {

	public static void main(String[] args) {
		
	    XYZ x1 = new XYZ();
	    x1.get(6,3);
	    x1.sum();
	    x1.sub();
	    x1.prod();
	    x1.div();

	}

}
