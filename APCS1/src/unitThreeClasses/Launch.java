package unitThreeClasses;

public class Launch {

	public static void main(String[] args) {

		// get date
		BankDay day = new BankDay();
		String x = day.day();

		// instantiate a banker
		Banker b = new Banker("joe");

		// instantiate a bankday
		BankDay date = new BankDay(x, b, Banker.read("F:\\CS\\Period6\\classes and objects\\bank_account_2013.txt"));

		// search for 5 names
		System.out.println(date.search("Ahmed"));
		System.out.println(date.search("Adrien"));
		System.out.println(date.search("Aidan"));
		System.out.println(date.search("Adolfo"));
		System.out.println(date.search("Adonis"));

	}

}
