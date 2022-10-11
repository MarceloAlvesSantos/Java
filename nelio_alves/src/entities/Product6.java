package entities;

public class Product6 {
	private int number;
	private String holder;
	private double balance;
	
	public Product6(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	
	public Product6(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account" + getNumber() + ", Holder: " + getHolder() + ", Balance: $" + String.format("%.2f", getBalance());
	}
}
