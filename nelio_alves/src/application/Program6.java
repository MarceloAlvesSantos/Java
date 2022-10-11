package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product6;

public class Program6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product6 account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit(y / n)? : ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter inicial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Product6(number, holder, initialDeposit);
		}else {
			account = new Product6(number, holder);
		}
		
		System.out.println("\nAccount data:\n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:\n" + account);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Updated account data:\n" + account);

		sc.close();
	}
}
