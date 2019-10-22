package unitThreeClasses;

public class BankDay {

	String date = "October 20, 2019";
	Banker banker;// instantiate
	BankAccount[] account;

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
		;
		
		for(int i = 0; i<=20; i++) {
			if(Banker.line.contains(s)) {
				System.out.println("found");
				BankAccount returned = (BankAccount) Banker.line;
				return returned;
			} else {
				System.out.println("not found");
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
