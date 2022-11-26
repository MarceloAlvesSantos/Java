package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.ReservationTow;

public class ProgramTwo {
	public static void main(String[] args) throws ParseException {
		// Primeira solu��o menos ruim de excecoes
		// Retorna uma String da classe ReservationTwo, menos a do construtor
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-Out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) { // Essa valida��o ficou aqui pois � do construtor, e ele nao retorna String
			System.out.println("Error in reservation: Check-out date must be after check-in date!");
		}else {
			ReservationTow reservation = new ReservationTow(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			}else {
				System.out.println("Reservation: " + reservation);
			}
		}
		
		sc.close();
	}

}
