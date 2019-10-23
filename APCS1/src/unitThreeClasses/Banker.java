package unitThreeClasses;

import java.io.File;
import java.util.Scanner;

public class Banker {

	public String name;
	static BankAccount[] accounts = new BankAccount[20]; // must be static because calling from static method main()

	public Banker(String name) {
		this.name = name;
	}

	public static BankAccount[] read(String fileName) {
		// accepts parameter String fileName (remember to escape characters)

		System.out.println("Reading File from Java code");

		// flow
		try {

			File file = new File(fileName); // instantiate file as new file with filename
			Scanner in = new Scanner(file);
			
			String line;

			// Read file line by line and print on the console
			for (int i = 0; i < 20; i++) {
				String name = in.next();
				int bal = in.nextInt();
				line = name + "      " + bal;
				System.out.println(name + "     " + bal);
				accounts[i] = new BankAccount(name, bal);
			}

			// Close the buffer reader
			in.close();

		} catch (Exception e) {
			System.out.println("Error while reading file line by line:" + e.getMessage());

		}

		return accounts;

	}

	public String greeting() {
		return "Hello! " + name;
	}

}
