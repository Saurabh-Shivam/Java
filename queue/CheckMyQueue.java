package queue;

public class CheckMyQueue {

	public static void main(String[] args) {

		  MyQueue<Integer> mq = new MyQueue<>();
		  
		  mq.enqueue(12);
		  mq.enqueue(67);
		  mq.enqueue(55);
		  mq.enqueue(34);
		  mq.enqueue(23);
		  
		  System.out.println(mq.dequeue());
		  System.out.println(mq.dequeue());
		  System.out.println(mq.dequeue());
		  System.out.println(mq.dequeue());
		  System.out.println(mq.dequeue());
		  System.out.println(mq.dequeue());
		  
		  mq.enqueue(155);
		  System.out.println(mq.dequeue());
		  

	}

}
