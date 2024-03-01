package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {

       ArrayDeque<Integer> ad = new ArrayDeque<>();
       
       // Used as ArrayDeque
       
       ad.addFirst(12);
       ad.addFirst(35);
       
       ad.pop();
       
       System.out.println(ad.peek()); 

       
       // Used as Stack
       
  // NOTE:- Stack is made by Vector class.
       
    /* ad.push(12);
       ad.push(56);
       ad.push(35);
       
       System.out.println(ad.pop());
       System.out.println(ad.pop()); */
       
	}

}
