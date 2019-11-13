package statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCode {
	int myData[] = new int[1039];

	public int[] readCode() {

		try {

			File inFile = new File("numbers.txt");
			Scanner in = new Scanner(inFile);

			for (int i = 0; i < 1039; i++) {
				myData[i] = in.nextInt();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return myData;

	}
}