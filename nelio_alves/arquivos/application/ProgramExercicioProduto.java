package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class ProgramExercicioProduto {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Produtos> list = new ArrayList<>();
		
		System.out.println("Enter file path: "); // entrar com o caminho de entrada
		String sourceFileStr = input.nextLine(); // c:\temp\vendas.csv
		
		File souceFileStr = new File(sourceFileStr);
		String sourceFolderStr = souceFileStr.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(souceFileStr)))
		{
			String itemCsv = br.readLine();
			while(itemCsv != null) 
			{
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Produtos(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr)))
			{
				for(Produtos item : list)
				{
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr +" CREATED!");
			}
			catch(IOException e)
			{
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch(IOException e)
		{
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		input.close();
	}

}
