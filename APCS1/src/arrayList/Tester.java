package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<BankAccountArrList> accounts = new ArrayList<>();

		String name = "";
		double amount = 0;
		double max = 0;

		while (1 == 1) {

			System.out.println("Hello, Please enter the name of the account");
			name = scanner.next();

			if (!name.equalsIgnoreCase("exit")) {

				System.out.println("Please enter the balance");
				amount = scanner.nextDouble();

				// new bankaccount(name, amount);

				BankAccountArrList account = new BankAccountArrList(name, amount);
				accounts.add(account);
			} else if (name.equalsIgnoreCase("exit")) {
				for (BankAccountArrList a : accounts) {
					if (a.balance >= max) {
						max = a.balance;
					}
					System.out.println(a.name);
					System.exit(10);
				}
			}

		}

	}

}
