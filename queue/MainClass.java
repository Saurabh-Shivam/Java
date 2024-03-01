package queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

       Queue<Integer> q = new LinkedList<>();
       
    /* q.add(12);
       q.add(23);
       q.add(34);
       
       System.out.println(q);
       
       System.out.println(q.remove());
       System.out.println(q.remove());
       
       System.out.println(q.element()); */
       
    // q.remove();
       
       System.out.println(q.poll());  
       
 /* NOTE:- Difference between poll()  and remove() is that pool() will return null, will not throw exception when the queue is
  * empty while remove() will throw exception when the queue is empty.
 */
	}

}
