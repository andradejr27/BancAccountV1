package model.entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance = 0.0;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount < balance) {
			balance -= amount + 5.0;
		}
		else {
			System.out.println("Not enough balance!");
		}
	}

	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
