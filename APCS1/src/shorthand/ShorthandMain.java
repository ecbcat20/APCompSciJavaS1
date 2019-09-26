package shorthand;

public class ShorthandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("\n" + "Enter s1, s2, s3, s4, or s5: "); //make selection
			ShorthandNoReplace.selection = ShorthandNoReplace.scanner.next();

			ShorthandNoReplace.s1 = ShorthandNoReplace.s1.toLowerCase(); //convert all to lower case
			ShorthandNoReplace.s2 = ShorthandNoReplace.s2.toLowerCase();
			ShorthandNoReplace.s3 = ShorthandNoReplace.s3.toLowerCase();
			ShorthandNoReplace.s4 = ShorthandNoReplace.s4.toLowerCase();
			ShorthandNoReplace.s5 = ShorthandNoReplace.s5.toLowerCase();

			ShorthandNoReplace.selection.toLowerCase(); //can exit with q or Q

			ShorthandNoReplace string1 = new ShorthandNoReplace(ShorthandNoReplace.s1); //create objects
			ShorthandNoReplace string2 = new ShorthandNoReplace(ShorthandNoReplace.s2);
			ShorthandNoReplace string3 = new ShorthandNoReplace(ShorthandNoReplace.s3);
			ShorthandNoReplace string4 = new ShorthandNoReplace(ShorthandNoReplace.s4);
			ShorthandNoReplace string5 = new ShorthandNoReplace(ShorthandNoReplace.s5);

			switch(ShorthandNoReplace.selection) { //switch for running methods

			case "s1": string1.string1(); //s1, run string1
			break;

			case "s2": string2.string2(); //s2, run string2
			break;

			case "s3": string3.string3(); //s3, run string3
			break;

			case "s4": string4.string4(); //s4, run string4
			break;

			case "s5": string5.string5(); //s5, run string5
			break;

			case "q": System.exit(10); //exit
			break;

			case "Q": System.exit(10); //exit
			break;

			} 

		} while(ShorthandNoReplace.i==1); //always, essentially.

		ShorthandNoReplace.scanner.close(); //close scanner 

	}
}


