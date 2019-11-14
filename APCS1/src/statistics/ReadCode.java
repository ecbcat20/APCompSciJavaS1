package statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCode {
	static int myData[] = new int[1039]; // array that is being written to

	public int[] readCode(String filePath) {

		try {

			File inFile = new File(filePath);
			Scanner in = new Scanner(inFile);

			for (int i = 0; i < 1039; i++) {
				myData[i] = in.nextInt();
			}

			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return myData;

	}
}