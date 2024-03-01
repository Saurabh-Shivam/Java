package oops.interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {

		Person obj = new Person();
	/*	obj.study();
		obj.makevideo(); */
		
	// YouTuber obj2 = new YouTuber(); // We cannot make an object of YouTuber because it is not a class it is an interface.
	
	YouTuber obj2 = obj;  // This is because Person is a Youtuber. Here we have done Upcasting.
	obj2.editVideo();
	obj2.makevideo();
	}

	@Override
	public void study() {
		System.out.println("Person is studying.");
		
	}

	@Override
	public void makevideo() {
		System.out.println("Person is making videos.");
		
	}

	@Override
	public void editVideo() {
		System.out.println("YouTuber is editing.");
		
	}
	
	public void uploadVideo() {
		
	}

}
