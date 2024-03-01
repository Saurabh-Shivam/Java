package linkedLists;

public class CheckMyLinkedList {

	public static void main(String[] args) {

      MyLinkedList<Integer> myll = new MyLinkedList<>();
      MyLinkedList<String> myllt = new MyLinkedList<>();
      
      for(int i = 0; i<10; i++) {
    	  myll.add(i);
      } 
      
      for(int i = 0; i<10; i++) {
    	  myllt.add(i+" added ");
      }
      
      myll.print();
      myllt.print();

	}

}
