package application;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j =  0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int contarNegativos = 0;
		System.out.println("Maior diagonal: ");
		for(int i = 0; i < n; i++) {
			for(int j =  0; j < n; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + " ");
				}
				if(mat[i][j] < 0) {
					contarNegativos++;
				}
			}
		}
		System.out.println("\nNegative numbers = " + contarNegativos);
		sc.close();
	}

}
