package vectorAndStacks;

import java.util.Stack;
//import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {

     /* Vector<Integer> v = new Vector<>();
        v.add(34);
        v.add(21);
        System.out.println(v);

   NOTE:- Vector is same as the ArrayList but is less efficient and more time consuming than ArrayList, so they are not
          generally taken into use. */
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int pooped = stack.pop();
		System.out.println(pooped); 
	 // NOTE:-The output of the pooped will be the element which we have push in the last and so on.
		
     /* pooped = stack.pop(); // This will print the second second last entered element.
     // pooped = stack.pop();  // This is used the third time so it will give the first entered element.
     // pooped = stack.pop();  // This will give error because we have entered only 3 elements.
        System.out.println(pooped); */
		
		int peeked = stack.peek(); // This will print the current element present on the top.
	    System.out.println(peeked); 
	    
	    
	}
 
}
