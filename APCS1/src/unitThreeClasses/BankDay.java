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

	public BankAccount search(BankAccount s) {
		for (int i = 0; i < 20; i++) {
			if (s == account[i]) { //error line
				System.out.println("found at: " + account[i]);
				returned = account[i];
			} else {
			
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

}
