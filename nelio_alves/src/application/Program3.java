package application;

import java.util.Scanner;

import entities.Product3;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar: ");
		int N = sc.nextInt();
		
		Product3 []vect = new Product3[N];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			vect[i] = new Product3(name, age);
		}
		int large = 0;
		int index = -1;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() > large){
				large = vect[i].getAge();
				index = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + vect[index].getName());
		
		sc.close();
	}

}
