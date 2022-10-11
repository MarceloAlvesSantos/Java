package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // não aceita tipo primitivo
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());
		for(String nome: list) {
			System.out.println(nome);
		}
		//list.remove("Anna");
		//list.remove(1);
		System.out.println("---------------------------");
		list.removeIf(nome -> nome.charAt(0) == 'M');
		for(String nome: list) {
			System.out.println(nome);
		}
		System.out.println("---------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Anna"));
		System.out.println("Index of Bob: " + list.indexOf("Marco")); // Quando não encontra, retorna -1
		System.out.println("---------------------------");
		List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());
		for(String nome: result) {
			System.out.println(nome);
		}
		System.out.println("---------------------------");
		// retorna o primeiro nome com 'A'
		String name = list.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null); 
		System.out.println(name);
		
	}

}
