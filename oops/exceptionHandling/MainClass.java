package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {

          try {              // If we have a doubt on a particular code that it will give error but also want to execute
        	                //   other lines of code without giving error we use try and catch method.
        	 /* int a = 5;
        	  int b = 0;
        	  
        	  int c = a/b;
        	  
        	  System.out.println(c); */
        	  
              int x[] = new int[5];
        	  
        	  System.out.println(x[6]);
        	  
          } catch(ArithmeticException e) {
        	 System.out.println(e.getMessage() + " occured, please check your code.");  
          } catch(ArrayIndexOutOfBoundsException e) {
        	  System.out.println("index should be in the range of 0 to size of array.");
          } catch(IllegalArgumentException e) {
        	  System.out.println("check your casting carefully. ");
          } finally {        // This always runs whether you have used the catch for specific code or not.
        	  System.out.println("Sorry for the inconvenience.");
          }
          
          System.out.println("Very important code");
          System.out.println("need to run."); 
          
          
         fun1();

	}
	
	        static void fun1() {
                 int a = 5;
	             int b = 3;
	  
	            int c = a/b;
	  
	           System.out.println(c);
	           
	          try {
	        	  Thread.sleep(1000);  // Stops the execution of program or code for given milliseconds of time interval.
	        	//  fun2();  
	          } catch(Exception e) {
	        	  System.out.println(e.getMessage()+ " occured");
	          }
	           
	          System.out.println("Shown after delay using the thread class");
	           
  }
	        
	        static void fun2() throws ArrayIndexOutOfBoundsException {
	        	 
		           boolean isDanger = true;
		           if(isDanger) {
		        	   throw new ArrayIndexOutOfBoundsException("danger was coming"); // We use this rarely.
		           }
	        }

}
