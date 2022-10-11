package application;

import java.util.Scanner;

import entities.Product4;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Quantas pessoas serão digitadas? ");
			int n = sc.nextInt();
			
			Product4 []vect = new Product4[n];
			
			for(int i = 0; i < vect.length; i++) {
				System.out.print("Dados da " + (i+1) + "ª pessoa:\n");
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				vect[i] = new Product4(name, idade, altura);
			}
			double sum = 0.0;
			int menosDezesseis = 0;
			
			for(int i = 0; i < vect.length; i++) {
				sum += vect[i].getAltura();
				if(vect[i].getIdade() < 16) {
					menosDezesseis ++;
				}
			}
			double media = sum / n;
			double porcentagemMenosDezesseis = (menosDezesseis * 100) / n;
			System.out.printf("\nAltura média: %.2f", media);
			System.out.printf("\nPessoas com menos de 16 anos: %.2f %% \n", porcentagemMenosDezesseis);
			
			for(int i = 0; i < vect.length; i++) {
				if(vect[i].getIdade() < 16) {
					System.out.println(vect[i].getName());
				}
			}
		sc.close();
	}
}
