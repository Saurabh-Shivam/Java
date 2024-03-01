package oops.inheritence.superFunction;

class A{
	int x;
	A(int P){
		x = P;
	}
	
	void show() {
		System.out.println("X = " +x);
	}
}

class B extends A{
	int q;
	B(int x, int y){
		super(x);
		q = y;
	}
	void Display() {
		System.out.println("Q = " +q);
	}
}

public class Example {

	public static void main(String[] args) {
		
		B b1 = new B(10, 20);
		b1.show();
		b1.Display();
	}

}
