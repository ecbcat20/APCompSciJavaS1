package unitThreeClasses;

public class BankAccount {

	private double balance;
	private String name;

	// default constructor
	public BankAccount() {
		balance = 0;
		name = "guest";
	}

	// secondary constructor
	public BankAccount(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	// deposit
	public void deposit(double amount) {
		balance += amount;
	}

	// withdraw
	public void withdraw(double amount) {
		balance -= amount;
	}

	// print name and balance
	public String toString() {

		String everything = "Hello, " + name + " Your balance is: " + balance + ".";
		return everything;
	}

}
