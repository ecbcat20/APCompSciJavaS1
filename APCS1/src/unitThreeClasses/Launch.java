package unitThreeClasses;

public class Launch {

	public static void main(String[] args) {
		
		BankDay day = new BankDay();
		day.day();
		
		Banker b = new Banker(null);
		System.out.println(b.read("/volumes/USB2A/CS/Period6/classes and objects/bank_account_2013.txt"));
		
		
		
	}

}
