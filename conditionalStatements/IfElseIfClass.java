package conditionalStatements;

public class IfElseIfClass {

	public static void main(String[] args) {
		
		int a = 23;
		
		if(a <= 10) {
			System.out.println(" The number is less than 10.");
		}
		 
		else if(a > 10 && a <= 20) {
			System.out.println(" The number is greater than 10 but less than 20.");
		}
           else if(a > 20 && a <=30) {
        	System.out.println(" The number is greater than 20 but less than 30.");
           }
           else {
            System.out.println(" The number is greater 30.");
}
		
		
		
		
}
}