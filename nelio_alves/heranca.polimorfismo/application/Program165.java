package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program165 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char tipoConta = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double  anualIncome = sc.nextDouble();
			if(tipoConta == 'i') 
			{
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				TaxPayer tax = new Individual(name, anualIncome, healthExpenditures);
				list.add(tax);
			}else 
			{
				System.out.print("Number of employees:" );
				int numberOfEmployees = sc.nextInt();
				TaxPayer tax = new Company(name, anualIncome, numberOfEmployees);
				list.add(tax);
			}
		}
		
		System.out.println("\nTAXES PAID: ");
		double soma = 0.0;
		for(TaxPayer taxP : list) {
			System.out.println(taxP.getName() + ": $ " + String.format("%.2f", taxP.tax()));
			soma += taxP.tax();
		}
		System.out.println("\nTOTAL TAXES: $ " + soma);
		
		sc.close();
	}

}
