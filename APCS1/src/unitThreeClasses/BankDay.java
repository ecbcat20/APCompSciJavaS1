package unitThreeClasses;

public class BankDay {
	
	String date = "October 20, 2019";
	private Banker banker;
	
	public BankDay(String date, Banker b, String[] accounts) {
		this.date = date;
		this.banker = b;
	}
	
	public String day() {
		return date;
	}
	
	
	
	
	
	

}
