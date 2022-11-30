package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramArq {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try 
		{
			sc = new Scanner(file);
			while (sc.hasNextLine()) // Testar para ver se exister uma nova linha no arquivo
			{
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e)
		{
			System.out.println("Erro: " + e.getMessage());
		}
		finally // Boa prática é colocar o fechamento do arquivo no finally, pois assim de qualquer modo vai fechar, dando certo ou errado
		{
			if (sc != null) // pois pode não ter nem sido instanciado, se não vai dar um "NullPointerException", pois o sc vai estar valendo null
				sc.close();
		}
	}

}
