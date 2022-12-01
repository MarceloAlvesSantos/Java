//Cria/recria o arquivo: new FileWriter(path) 
//Acrescenta ao arquivo existente: new FileWriter(path, true)
package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramArq4 {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
		{
			for (String line : lines) 
			{
				bw.write(line); // N�o tem quebrar de linha, ent�o colocar um bw.newLine();
				bw.newLine();
			}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
