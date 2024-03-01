package forLoop;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		// Series sum with only plus sign in the result.
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float result = 0;
		
		/*for(float i = 1; i <= n; i++) {
			
			result += 1/i;
		}
		
		System.out.println(result);*/
		
		
		//  Series sum of even and odd numbers with plus and minus sign in the result.
		
	 for(float i = 1; i <= n; i++) {
		 
		 if(i % 2 == 0) {
			 result -= 1/i;
		 }
		 else {
			 result += 1/i;
		 }	
		 
	 }
	 
         System.out.println(result);
	}

}
