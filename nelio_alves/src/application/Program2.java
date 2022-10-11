package application;

import java.util.Scanner;

import entities.Product2;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Contação do dolar: ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantidade de dolares: ");
		double quantidade = sc.nextDouble();
		
		System.out.println("Valor a ser pagp em reais: " + Product2.Converter(cotacao, quantidade));
		sc.close();
	}

}
