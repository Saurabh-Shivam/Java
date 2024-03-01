package methods;

class Room {
	
	 float l,b;
	 void get(float x, float y) {
		 l = x;
		 b = y;
	 }
}

public class Area {

	public static void main(String[] args) {
		
     Float area;
     Room r1 = new Room();
     r1.get(10,2);
     area = r1.l * r1.b;
     System.out.println("Area = " +area);
     
	}
	
}
