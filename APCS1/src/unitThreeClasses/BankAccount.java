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
	public BankAccount(String name, double balance) {
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

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

}
