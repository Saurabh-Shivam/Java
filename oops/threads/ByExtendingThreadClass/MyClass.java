package oops.threads.ByExtendingThreadClass;

public class MyClass {

	public static void main(String[] args) {

   Loader obj = new Loader();
   obj.start();

   
   /* As we see out loader class extends the thread class and overrides its run() method. When we create the obj object and
    * call its start() method then the run() method statements execute on a different thread. */
    
  }
 }
