package lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

      ArrayList<String> fruits = new ArrayList<>();  // Under the angular brackets '<>' we have defined a type which is what we
                                                   // call generics.
      fruits.add("Apple");                        
   // fruits.add(23);    // This is giving error because we have defined the generics to String type.
      fruits.add("Orange"); 
      fruits.add("Mango");
      fruits.add("Guava");
     
  //  System.out.println(fruits);
        
       List<String> vegetables = new ArrayList<>();  // We can also use List instead of ArrayList and this is of writing this is
                                               // more beneficial.
       vegetables.add("Potato");
       vegetables.add("Carrot");
       vegetables.add("Tomato");
       
     /*  fruits.addAll(vegetables);   // Enables to merge two lists together.
       System.out.println(fruits); */
       
       
     //  System.out.println(fruits.get(0));  // Returns the element at the specified position in the list.
       
       
    /*   fruits.set(1, "Banana");   // Enables us to change the data of the list, has changes the Orange to Banana.
       System.out.println(fruits);  */
       
       
   /*    fruits.remove(3);    // Enables to remove one data at a time, has removed the Guava from the list.
       System.out.println(fruits); */
       
       
      /* fruits.clear();    // Removes the whole list data at once.
       System.out.println(fruits); */
       
       
     /*  List<String> toRemove = new ArrayList<>(); // Removes the selected items at once from the list.
       toRemove.add("Apple");
       toRemove.add("Guava");
       fruits.removeAll(toRemove);
       System.out.println(fruits); */
       
    //  System.out.println(fruits.size()); // Enable us to check the size of the list.
    
        
    /*  System.out.println(fruits.contains("Guava")); // Enable us to check whether the list contain specific data or not.
      System.out.println(fruits.contains("Melon")); */
      
      
   //   System.out.println(fruits.isEmpty()); // Enables us to check whether the list is empty or not.
      
      
     /* String temp[] = new String[fruits.size()]; // Enables our list to return an array or we can say it enables to convert a
      fruits.toArray(temp); */                     // list into an array, only if we want array of an object created.
  /*  for(String e: fruits) {    // We can simply convert the list into array by using for each loop without creating a new 
       System.out.println(e);    // object.
      }  */
       
       
        
     /*   Pair<String, Integer> p1 = new Pair("Saurabh", 457);
        Pair<Boolean, String> p2 = new Pair(true, "Hello");
        
        p1.getDescription();
        p2.getDescription(); */
	}

}
