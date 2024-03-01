package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float result = 0;
		
		Scanner sc =  new Scanner(System.in);
		System.out.print(" Enter First number:");
		float a = sc.nextFloat();
		
		System.out.print(" Enter Second number:");
		float b = sc.nextFloat();
		
		System.out.print(" Enter the operation number:");
		sc.nextLine();
		char operation= sc.nextLine().charAt(0);
		
		switch(operation) {
		case '+':
	       result = a + b;
		break;
		
		case '-':
			result = a - b;
			break;
			
      	case '*':
			result = a * b;
			break;
			

		case '/':
			result = a / b;
			break;
			
        default:
        	System.out.println(" INVALID OPERATION");
        	
		}
		
		System.out.println(" The Result is = " + result);
		
		
		
		
	}

}
