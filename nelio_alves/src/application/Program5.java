package application;

import java.util.Scanner;

import entities.Product5;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product5[] vect = new Product5[n];
		
		for(int i = 0; i < vect.length; i++) { // n OR vect.length
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product5(name, price);		
		}
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		System.out.printf("Average price: %.2f", avg);
		
		sc.close();
	}

}
