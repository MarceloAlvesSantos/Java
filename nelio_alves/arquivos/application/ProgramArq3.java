// Opção melhor, pois fecha os arquivos automático
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramArq3 {
	
	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
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
	}
}
