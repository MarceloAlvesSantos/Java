package atividade162.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Produto{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactuteDate;
	
	public UsedProduct(){
		super();
	}

	public UsedProduct(String name, double price, Date manufactuteDate) {
		super(name, price);
		this.manufactuteDate = manufactuteDate;
	}

	public Date getManufactuteDate() {
		return manufactuteDate;
	}

	public void setManufactuteDate(Date manufactuteDate) {
		this.manufactuteDate = manufactuteDate;
	}
	
	 @Override
	public String priceTag() {
		return getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(manufactuteDate) + ")";
	}
	
	
}
