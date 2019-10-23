package unitThreeClasses;

public class Launch {

	public static void main(String[] args) {

		// get date
		BankDay day = new BankDay();
		String x = day.day();

		// instantiate BankAccounts
		BankAccount Ahmed = new BankAccount("Ahmed", 1018);
		BankAccount Adrien = new BankAccount("Adrien", 1013);
		BankAccount Aidan = new BankAccount("Aidan", 1019);
		BankAccount Adolfo = new BankAccount("Adolfo", 1011);
		BankAccount Adonis = new BankAccount("Adonis", 1012);

		// instantiate a banker
		Banker b = new Banker("joe");

		// instantiate a bankday
		BankDay date = new BankDay(x, b, Banker.read("E:\\CS\\Period6\\classes and objects\\bank_account_2013.txt"));

		// functional to this point :)
		System.out.println(date.search(Ahmed));
		System.out.println(date.search(Adrien));
		System.out.println(date.search(Aidan));
		System.out.println(date.search(Adolfo));
		System.out.println(date.search(Adonis));

	}

}
