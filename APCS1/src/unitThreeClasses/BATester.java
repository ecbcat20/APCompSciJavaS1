package unitThreeClasses;

public class BATester {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount("Name", 0);

		myAccount.deposit(505.22);
		System.out.println(myAccount.toString());

		myAccount.withdraw(100);
		System.out.println(myAccount.toString());

	}

}
