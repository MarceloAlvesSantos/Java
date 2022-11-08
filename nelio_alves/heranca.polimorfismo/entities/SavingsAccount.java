package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updatebalance() {
		balance += balance * interestRate;
	}
	
	// Usou se o final para evitar sobreporsições multiplas
	@Override
	public final void withdraw(double amount) { 
		this.balance -= amount;
	}
	
	// final na classe não deixar ela ser herdada
	// final no metodo não deixar ele ser sobreposto
	
}
