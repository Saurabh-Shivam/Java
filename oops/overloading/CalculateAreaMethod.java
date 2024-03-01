package oops.overloading;

class Area {
	float l,b;
	void input(float x, float y) {
		l = x;
		b = y;
	}
	
	void input(float x) {
		l = b =x;
	}
	
	void area() {
		float a = l * b;
		System.out.println("Area = " +a );
	}
}


public class CalculateAreaMethod {

	public static void main(String[] args) {
		
         Area a1 = new Area();
         a1.input(3,5);
         a1.area();
         a1.input(4);
         a1.area();
	}

}
