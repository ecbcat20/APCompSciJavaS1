package unitThreeClasses;

public class BankDay {

	String date = "October 20, 2019";
	Banker banker;// instantiate
	BankAccount[] account;
	BankAccount returned;

	public BankDay(String date, Banker b, BankAccount[] accounts) { // pass
		this.date = date;
		this.account = accounts;
		this.banker = b; // declare
	}

	public BankDay() {
		date = "October 20, 2019";
	}

	public String day() {
		return date;
	}

	public BankAccount search(String s) {
		for (int i = 0; i < 20; i++) {
			if (account[i].getName().equals(s)) { // error line
				System.out.println("found at: " + Banker.accounts[i]);
				returned = Banker.accounts[i];
			}

		}

		return returned;

	}

	public void setBanker(Banker b) {
		banker = b;
	}

	public Banker getBanker() {
		return banker;
	}
	
	public String greet() {
		return "hello my name is " + banker;
		
	}

}
