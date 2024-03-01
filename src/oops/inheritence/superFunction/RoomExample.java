package oops.inheritence.superFunction;

class Ar{
	int x,y;
	 Ar(int l, int b) {
		x = l;
		y = b;
	}
	void Area() {
		System.out.println("Area = " +x*y);
	}
}

class V extends Ar{
	int z;
	 V(int l, int b, int h) {
	super(l,b);
	 z = h;
	}
	void Volume() {
		System.out.println("Volume = " +x*y*z);
	}
}
public class RoomExample {

	public static void main(String[] args) {
		
		V r1 = new V(10,20,30);
		r1.Area();
		r1.Volume();

	}

}
