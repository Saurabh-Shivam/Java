package oops;

/* class Vehicles {
	
	int wheels;
	int headLights;
	
	Vehicles() {            // This is a no-arguement contructor because it is not accepting any paramenters.
	wheels = 4;
	headLights = 2;
	}
} */

class Vehicle {    
	
	Vehicle() {        // This is a default constructor created manually if we don't want to pass any parameter in it.   
		
	}
	
	int wheels;
	String color;
	
	 Vehicle(int wheels) {                 // This is a parameterized contructor because it is accepting paramenters.
		 this.wheels = wheels;                   // Or you can do like this:-
		 int headLights = 2;                           // Vehicle(int noOfWheels) {          
	 }   	                                                 // wheels = noOfWheels;
		                                                    // int headLights = 2; 
                                                            // }
	
	 Vehicle(int wheels, String color){
		this.wheels = wheels;     // "this" keyword points the current object about whom we are talking.
		this.color = color;
	}
}

public class MyConstructor {
	
	MyConstructor(){            
		                                                  
		System.out.println("Object is now created");
		
	}

	public static void main(String[] args) {
		
		MyConstructor obj = new MyConstructor();   /* Just think that after new MyConstructor() is called like a method.
                                                      NOTE- This is not the actual reason behind it. */
		
		/* Vehicles car = new Vehicles();                 
		Vehicles car2 = new Vehicles();
		
		System.out.println(car.wheels + " wheels ");
		System.out.println(car2.wheels + " wheels "); */
		
		Vehicle cars = new Vehicle(2);
		Vehicle scooty = new Vehicle(4);
		Vehicle eRikshaw = new Vehicle(3, "Yellow");
		Vehicle random = new Vehicle();
		
		System.out.println(cars.wheels +" Wheels of scooty ");
		System.out.println(scooty.wheels +" Wheels of cars ");
        System.out.println(eRikshaw.wheels +" Wheels of eRikshaw and it's color = " + eRikshaw.color);
        System.out.println(random.wheels +" Wheels of random vehicle ");
	}

}
