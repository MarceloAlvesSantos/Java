package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.AccountEx177;
import model.exceptions.BusinessException;

public class Program177 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		
		AccountEx177 account = new AccountEx177(number, holder, balance, limit);
		
		System.out.print("\nEnter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try 
		{
			account.withdraw(amount);
			System.out.println(String.format("New balance: %.2f", account.getBalance()));
		}
		catch(BusinessException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
}
