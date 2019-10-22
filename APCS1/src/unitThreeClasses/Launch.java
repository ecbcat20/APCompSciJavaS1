package unitThreeClasses;

public class Launch {

	public static void main(String[] args) {

		// get date
		BankDay day = new BankDay();
		String x = day.day();

		// instantiate a banker
		Banker b = new Banker("joe");
		Banker.read("E:\\CS\\Period6\\classes and objects\\bank_account_2013.txt");

		// instantiate a bankday
		BankDay date = new BankDay(x, b, Banker.read("E:\\CS\\Period6\\classes and objects\\bank_account_2013.txt"));

		// functional to this point :)
		date.search();
		date.search("Ahmad");
		date.search("Ahmed");
		date.search("Adriel");

	}

}
