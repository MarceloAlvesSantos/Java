// funções da class File
package application;

import java.io.File;
import java.util.Scanner;

public class ProgramCaminhoArq {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = input.nextLine();
		
		File path = new File(strPath);
		
		// Acessando apenas o nome do arquivo e não o caminho completo
		
		System.out.println("getNome: " + path.getName());
		
		// só caminho
		System.out.println("getParent: " + path.getParent()); 
		
		// Name completo
		System.out.println("getPath: " + path.getPath());
		
		input.close();
	}

}
