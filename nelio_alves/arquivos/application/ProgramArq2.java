// Abrindo e fechando manualmente FileReader e BufferedReader
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramArq2 {
	
	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
			fr = new FileReader(path);
			// Usando o FileReader dentro do BufferedReader, deixa mais flexivel o sistema de leitura
			br = new BufferedReader(fr); // O BufferedReader é uma abstração maior que o FileReader
			// Poderi ser -> br = new BufferedReader(new FileReader(path));
			// separado é melhor pois depois vamos fechar as duas String
			
			String line = br.readLine(); // Ler uma linha, se o arquivo estiver no final, o br.readLine() return null
			
			while (line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally 
		{
			try
			{
				if ( br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
