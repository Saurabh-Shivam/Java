package userInput;

import java.util.Scanner;

public class SimpleInterestProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();

		float simpleInterest = principal * rate * time / 100;

		System.out.println(" Principal = " + principal);
		System.out.println(" Rate = " + rate);
		System.out.println(" Time = " + time);
		System.out.println(" The simpleInterest is = " + simpleInterest);

	}

}
