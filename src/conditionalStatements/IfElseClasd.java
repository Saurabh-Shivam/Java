package conditionalStatements;

public class IfElseClasd {

	public static void main(String[] args) {

         int noOfPetals = 12;
         if(noOfPetals % 2 == 0) {
        	 System.out.println(" He loves me.");
         }
         else {
        	 System.out.println(" He loves me not.");
         }
	
	
      // Program Using Ternary Operator
 		
 		int x = 15;
 		int y = 8;
 		
 		int greaterOne = 0;
 		
 		greaterOne = (x > y ? x : y);
 		System.out.println(" Max Of Both Numbers is = " + greaterOne);
 		
	
	
	
	}

}
