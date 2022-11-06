package aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	
	public static void main(String[] args) {
		// Documentação: Class DateTimeFormatter
		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Para passar o formato que queremos
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-11-06");
		LocalDateTime d05 = LocalDateTime.parse("2022-11-06T01:30:26");
		Instant d06 = Instant.parse("2022-11-06T01:30:26Z");
		Instant d07 = Instant.parse("2022-11-06T01:30:26-03:00"); // Horário de londres a partir de São Paulo
		
		LocalDate d08 = LocalDate.parse("02/11/2022", fmt1); // formato customizado
		LocalDateTime d09 = LocalDateTime.parse("02/11/2022 01:30", fmt2);
		// Poderia colocar no lugar do fmt2 diretamente
		// LocalDateTime d09 = LocalDateTime.parse("02/11/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDate d10 = LocalDate.of(2022, 11, 06);
		LocalDateTime d11 = LocalDateTime.of(2022,  11, 06, 19, 11);
		
		System.out.println("d01 = " + d01); // implicitamente é d01.toString()
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
