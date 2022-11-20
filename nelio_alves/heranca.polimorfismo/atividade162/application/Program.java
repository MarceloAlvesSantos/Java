package atividade162.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import atividade162.entities.Produto;
import atividade162.entities.ProdutoImportado;
import atividade162.entities.UsedProduct;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		// Correcão:  https://github.com/acenelio/inheritance5-java
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Produto pro = new ProdutoImportado(name, price, customsFee);
				list.add(pro);
			}else if (ch == 'c') {
				Produto pro = new Produto(name, price);
				list.add(pro);
			}else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				Produto pro = new UsedProduct(name, price, date);
				list.add(pro);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Produto pro : list) {
			System.out.println(pro.priceTag());
		}
		
		sc.close();
	}

}
