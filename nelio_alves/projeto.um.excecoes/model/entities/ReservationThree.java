package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class ReservationThree {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut; 
	
	// É static para não instância para cada um, só vai precisar de um sdf
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ReservationThree() {
	}

	public ReservationThree(Integer roomNumber, Date checkIn, Date checkOut) {
		if(!checkOut.after(checkIn)) 
		{
			throw new DomainException("Check-out date must be after check-in date!");
		}
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
	
	// Usar long pois o calculo da diferença de datas retornar um long
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // milesegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // ms para dias
	}
	
	public void updateDates(Date checkIn, Date checkOut)
	{
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) 
		{
			throw new DomainException("Reservation dates for update must be future dates!");
		} 
		if(!checkOut.after(checkIn)) 
		{
			throw new DomainException("Check-out date must be after check-in date!");
		}
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
