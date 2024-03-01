package strings;

import java.util.Scanner;

class Bank{
	Scanner sc = new Scanner(System.in);
	String name, id, add;
	int ph;
	double bal,with,dep;
	
	void create_account() {
		System.out.println("Enter Your Name: ");
		name = sc.next();
		System.out.println("Enter Your Id: ");
		id = sc.next();
		System.out.println("Enter Your Address: ");
		add = sc.next();
		System.out.println("Enter Your Phone No.: ");
		ph = sc.nextInt();
	    bal = 1000;
	}
	
	void deposit() {
		System.out.println("Enter deposit amount: ");
		dep = sc.nextDouble();
		bal = bal + dep;
	}
	
	void withdraw() {
		System.out.println("Enter withdraw amount: ");
		with = sc.nextDouble();
		with = bal - with;
	}
	
	void display() {
		System.out.println("Name= " +name);
		System.out.println("Id= " +id);
		System.out.println("Address= " +add);
		System.out.println("Phone No.= " +ph);
		System.out.println("Balance= " +bal);
	}
}

public class BankApplication {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.create_account();
		b1.deposit();
	//	b1.withdraw();
		b1.display();

	}

}
