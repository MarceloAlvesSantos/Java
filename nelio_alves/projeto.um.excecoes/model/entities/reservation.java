package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut; 
	
	// � static para n�o inst�ncia para cada um, s� vai precisar de um sdf
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public reservation() {
	}

	public reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	// Usar long pois o calculo da diferen�a de datas retornar um long
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // milesegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS); // ms para dias
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	

}
