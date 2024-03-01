package vectorAndStacks;

public class CheckMyStack {

	public static void main(String[] args) throws Exception{


		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);;
		
		int pooped = stack.pop();
		System.out.println(pooped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
	    
	}

}
