package unitThreeClasses;

public class BankAccount {

	private double balance;
	private String name;

	// default constructor
	public BankAccount() {
		balance = 0;
		name = "guest";
	}

	public BankAccount(double balance, String name) {

	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public String toString() {

		String everything = "Hello, " + name + " Your balance is: " + balance + ".";
		return everything;
	}

}
