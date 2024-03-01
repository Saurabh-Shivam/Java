package strings;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {


		String name = "Saurabh Shivam";                  //String pool area
		
		String name2  = new String("Saurabh Shivam"); 
	
		
		
		String name3 = "";
		
		name = name + " is a goood boy.";   // this is the manual method of concating/joining the strings.
		System.out.println(name);
		System.out.println(name.concat(" He is dreaming to become a software developer.")); //Using concat() function
		
		System.out.println(name.replace('S', 'U'));  // This function replaces the old letter by a new letter in the string. 
		
		
		//name1 = "Shivam";
		/*String name2 = "Saurabh";                     //String pool area
		
		String anotherName = new String("Saurabh");    //heap area
		
		System.out.println(name);
		System.out.println(anotherName);
		
		System.out.println(name == anotherName);    //They both are different because one is from string pool area and another 
		                                             //is from heap area. 
		
		System.out.println(name == name2);         They both are same because both are from the string pool area. */
		
		System.out.println("Character at that index place is: "+ name.charAt(5));  
		
		System.out.println("Total number of charatcers available in the string is: "+ name.length());
		
		System.out.println(name.substring(5));
		
		System.out.println(name.substring(5, 12));
		
		System.out.println(name.contains("Saurabh"));
		
		System.out.println(name.equals(name2));
		
	/*	System.out.println(name.isEmpty());
		System.out.println(name3.isEmpty()); 
		
		//Split function returns arrays of string and we have to give the value around where we want the split.
		
		String cars = "Hyundai,maruti,Mercedies,Audi,Ferrari,Lamborghini,Buggati";
		
		String allcars[] = cars.split(",");
		
		for(String car: allcars) {
			System.out.println(car);
		}
		
		System.out.println(cars.indexOf('m'));   // Returns the first index number where it finds the letter first.
		System.out.println(cars.indexOf('z'));   // If the letter is not present there in the string it will return -1.
		
		
		System.out.println(cars.toLowerCase()); //This will return different string where the characters are in lower case.
		
		System.out.println(cars.toUpperCase()); //This will return different string where the characters are in upper case.
		
		String name5 = "    Stormbreaker   ";
		
		System.out.println(name5.trim()); */
}

}
