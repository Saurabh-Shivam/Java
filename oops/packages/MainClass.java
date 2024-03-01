package oops.packages;

import java.util.*;                               

import oops.packages.models.*;

public class MainClass {

	public static void main(String[] args) {

       Student obj = new Student("Tom");
       
      // obj.name = "Jerry";  // Here we are not able to access the name function because in the student class the visibility
                            // of name field is private it must be public to be accessed.
       
       obj.getPassword();
           
       Teacher teacher = new Teacher();
       
       Scanner sc = new Scanner(System.in);

	}

}
