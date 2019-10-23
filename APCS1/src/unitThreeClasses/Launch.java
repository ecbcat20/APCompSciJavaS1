package unitThreeClasses;

public class Launch {

	public static void main(String[] args) {

		// get date
		BankDay day = new BankDay();
<<<<<<< HEAD
		day.day();
		
		Banker b = new Banker(null);
		System.out.println(b.read("/volumes/USB2A/CS/Period6/classes and objects/bank_account_2013.txt"));
		
		
		
=======
		String x = day.day();

		// instantiate a banker
		Banker b = new Banker("joe");
		System.out.println(b.greeting());

		// instantiate a bankday
		BankDay date = new BankDay(x, b, Banker.read("F:\\CS\\Period6\\classes and objects\\bank_account_2013.txt"));

		// search for 5 names
		System.out.println(date.search("Ahmed"));
		System.out.println(date.search("Adrien"));
		System.out.println(date.search("Aidan"));
		System.out.println(date.search("Adolfo"));
		System.out.println(date.search("Adonis"));

>>>>>>> branch 'master' of https://github.com/ecbcat20/APCompSciJavaS1
	}

}
