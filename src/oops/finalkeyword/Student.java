package oops.finalkeyword;

public class Student {

	final int rollNo;  // This is a blank final variable.
	final String name;
	
	{                  // This is a normal initializer block mostly used to initialize a blank final variables.
		rollNo = 1;
	}
	 
	  public Student() {    // A constructor can also be used to initialize a blank final variable.
		  name = "Saurabh";
	  }
	  
  // NOTE:- We can also initialize under static initializer block under which only static variables can be initialized.
}
    
