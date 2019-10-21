package unitThreeClasses;

public class BankDay {

	String date = "October 20, 2019";
	private Banker banker;// instantiate

	public BankDay(String date, Banker b, String[] accounts) { // pass
		this.date = date;
		this.banker = b; // declare
	}

	public String day() {
		return date;
	}

	public BankAccountBanker search("bank_account_2013.txt") {

		return account;
	}

}
