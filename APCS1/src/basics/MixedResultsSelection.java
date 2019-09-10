package basics;

public class MixedResultsSelection {

	public static void main(String[] args) {
		//tool for selecting which case to run

		System.out.println("Make Your Selection, 1-5: ");
		MixedResults.selection = MixedResults.scannerFunctionSelector.nextInt(); //scanner for getting integer input

		switch (MixedResults.selection) { //switch for selecting which method

			case 1: MixedResults.testerFunction1();
			MixedResults.count++; //increase counter
			break;
	
			case 2: MixedResults.testerFunction2();
			MixedResults.count++;
			break;
	
			case 3: MixedResults.testerFunction3();
			MixedResults.count++;
			break;
	
			case 4: MixedResults.testerFunction4();
			MixedResults.count++;
			break;
	
			case 5: MixedResults.testerFunction5();
			MixedResults.count++;
			break;
	
			default: System.out.println("You Didn't Make a Selection!: "); //default action; loop back

		}
	}
}

