package linkedLists;

public class MyLinkedList<E> {   
	
	// NOTE 1:- There is always a head in a LinkedList class which is the first element.
	
	  
  /*NOTE 2:- When  the list is initially empty(no elements in the list) then our code will crash. This will be because if 
   * there will be no element in the list then the head will be null and when head will be null and ( temp = head ) is there 
   * in the code and the code will enter Eo the loop where it says ( temp.next != null ) , but temp is itself null so it 
   * will give null poEer exception, i.e you cannot take out next of any null element. 
  */
	
  /* If we want to make the LinkedList class generic then we have to write <E> (here E stands for element we can write any
   * variable there) in the classes and also replace the datatype to E, i.e if we have used int in the code then we have to
   * replace it with E.(To replace a particular word in the whole code with another word at one go use the shortcut CTRL+F)
   */
	Node<E> head;
	
    public void add(E data) {              
	   Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {     // to avoid (NOTE 2) we have done this
			head = toAdd;
			return;
		}

	Node<E> temp = head;
	while(temp.next != null) {
		temp = temp.next;
	}
	
	 temp.next = toAdd;
		
	}
	
	void print() {     // PrE Function which will enable us to prE the entered data

		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		
	}
	
    public boolean isEmpty() {        // To avoid (NOTE 2) we have done this 
		return head == null;
	}
    
    public E removeLast() throws Exception {
    	Node<E> temp = head;
    	
    	if(temp == null) {
    		throw new Exception("Cannot remove last element from empty linked list");
    	}
    	
    	if(temp.next == null) {
    		Node<E> toRemove = head;
    		head = null;
    		return toRemove.data;
    	}
    	while(temp.next.next != null) {
    	    temp = temp.next;
    	}
    	
    	Node<E> toRemove = temp.next;
    	temp.next = null;
    	return toRemove.data;
    }
    
    public E getLast() throws Exception {
        Node<E> temp = head;
    	
    	if(temp == null) {
    		throw new Exception("Cannot peek last element from empty linked list");
    	}
    	
    	while(temp.next.next != null) {
    	    temp = temp.next;
    	}
    	
    	return temp.data;
    }
	
    public static class Node<E> {     // Node class is made
    	public E data;
    	public Node<E> next;  // Reference what will be the next node
    	
    	public Node(E data) {
    		this.data = data;
    		next = null; 
    	}
    }
}
