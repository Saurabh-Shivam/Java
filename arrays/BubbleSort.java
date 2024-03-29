package arrays;

public class BubbleSort {

	public static void main(String[] args) {


		int a[] = {2, 1, 8, -3, 6, 4, 12};
		int n = a.length;
		
		for(int i = 0; i<n-1; i++) {
			
			boolean sorted = true;
			
			for(int j = 0; j<n-1-i; j++) {
				
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					sorted = false;
				}
		    }
			
			   if(sorted) {     // or you can write ->  if(sorted) break;
				  break;
			   }
		}
		
		for(int item: a) {                  // this type of loop is called for each loop.
			System.out.print(item+"  ");
		}
	}

}
