package application;

import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		Account acc = new Account(number, holder);
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			acc.deposit(amount);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		System.out.println();
		System.out.print("Enter deposit value: ");
		double amount = sc.nextDouble();
		acc.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		sc.close();
	}

}
