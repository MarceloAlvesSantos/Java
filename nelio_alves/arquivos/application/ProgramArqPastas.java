package application;

import java.io.File;
import java.util.Scanner;

public class ProgramArqPastas {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = input.nextLine();
		
		File path = new File(strPath);
		//Nome das pastas no endereço fornecido
		File[] folders = path.listFiles(File::isDirectory); // Lista apenas o que for pasta: File::isDirectory
		System.out.println("FOLDERS: ");
		for (File folder : folders) 
		{
			System.out.println(folder);
		}
		//Name dos arquivos no endereço fornecido
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files)
		{
			System.out.println(file);
		}
		//Criando pasta
		System.out.println();
		boolean success = new File(strPath + "\\subdir").mkdir(); // vai criar uma subPasta chamada "subdir"
		System.out.println("Directory created successfully: " + success);
		input.close();
	}

}
