package oops.inheritence;

class ABC{
	int a,b;
	void get(int x, int y) {
		a = x;
		b = y;
	}
	
	void show() {
		System.out.println("A = " +a + " B = " +b);
	}
}

class PQR extends ABC {
	// This class is created to show the existence of single inheritance in java
}

public class Example {

	public static void main(String[] args) {
		
        PQR k = new PQR();
        k.get(10, 15);
        k.show();
	}

}
