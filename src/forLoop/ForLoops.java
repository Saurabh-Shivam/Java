package forLoop;

public class ForLoops {

	public static void main(String[] args) {

        // Printing Hello WOrld  	
		
		for(int i = 0; i < 100; i++) {
			System.out.println(" Hello World " + i); 
		}
          
		// Printing Even Numbers
		
		for( int a = 0; a <= 100; a = a + 2) {
			System.out.println(a);
		}
		
		// Printing Sum Of Numbers Between 1 To 100
		
		int sum = 0;
		int n = 100;
		for(int x = 1; x <= n; x++) {
			sum = sum + x;
		}
		System.out.println(sum);
		
		
		// Printing Numbers From 100 To 1
		
		for(int b = 100; b > 0; b--) {
			System.out.println(b);
		}
		
		// Printing Table 
		
		int tableOf = 4;
		for(int z = 1; z <= 10; z++) {
			System.out.println(tableOf * z);
		}
		
		// When you doesn't match your update statement with your condition
		
		for(int p = 0; p <10; p--) {
			System.out.println(p);
		}
	}

}
