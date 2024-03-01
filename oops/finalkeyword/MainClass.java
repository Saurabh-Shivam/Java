package oops.finalkeyword;

public class MainClass extends Children {
	
	 /* public void getDescription() {            // This gives error because we cannot override the method because it has
		System.out.println("Inside main class"); // been made final in the Children class.
	} */
	
    // final int ROLL_NO = 4;

	public static void main(String[] args) {

     /* final String name = "Saurabh";
      
      final Children obj = new Children();
      
      Children obj2 = new Children();
       
      obj.name = "Shivam"; */
	
      
      MainClass obj = new MainClass();
      
      obj.getDescription();
      
	}

}
