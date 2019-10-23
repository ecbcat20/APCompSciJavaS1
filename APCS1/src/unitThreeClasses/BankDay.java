package unitThreeClasses;

public class BankDay {

	String date = "October 20, 2019";
	Banker banker;// instantiate

	public BankDay(String date, Banker b, String[] accounts) { // pass
		this.date = date;
		this.banker = b; // declare
	}

	public BankDay() {
		date = "October 20, 2019";
	}

	public String day() {
		return date;
	}

	public BankAccount[] search(String s) {
		return Banker.accounts;
	}

	public void setBanker(Banker b) {
		banker = b;
	}

	public Banker getBanker() {
		return banker;
	}

}
