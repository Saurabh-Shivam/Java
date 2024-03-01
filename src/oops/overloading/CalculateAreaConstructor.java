package oops.overloading;

class Areas{
	
	float l,b;
	Areas(float x, float y){
		l = x;
		b = y;
	}
	Areas(float x){
		l = b = x;
	}
	
	void calculate() {
		float a = l * b;
		System.out.println("Area = " +a);
	}
}

public class CalculateAreaConstructor {

	public static void main(String[] args) {
		
        Areas a1 = new Areas(22,24);
        a1.calculate();
        Areas a2 = new Areas(10);
        a2.calculate();
	}

}
