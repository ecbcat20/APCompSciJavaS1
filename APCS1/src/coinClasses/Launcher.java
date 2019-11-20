package coinClasses;

public class Launcher {

	public static void randomflip(Coin[] myCoin) {
		double rand;

		for (int i = 0; i < myCoin.length; i++) {
			rand = Math.random() * 11;
			if (rand <= 4) {
				myCoin[i].flip();
			}
		}
	}

	public static void displayFace(Coin[] myCoin) {
		System.out.println("\n");
		int z = 0;
		for (int i = 0; i < myCoin.length; i++) {
			if (z < 20) {
				System.out.print(myCoin[i].getFace().toString() + ", ");
				z++;
			} else if (z >= 20) {
				System.out.println();
				z = 0;
			}
		}
	}

	public static void displayFlips(Coin[] myCoin) {
		int x = 0;
		System.out.println();
		for (int i = 0; i < myCoin.length; i++) {
			if (x < 20) {
				System.out.print(myCoin[i].getFlips() + ", ");
				x++;
			} else if (x >= 20) {
				System.out.println();
				x = 0;
			}
		}
	}

	public static int countHeads(Coin[] myCoin) {
		Coin.heads = 0;
		for (int i = 0; i < myCoin.length; i++) {
			if (myCoin[i].getFace().toString() == "true") {
				Coin.heads++;
			} else {
				continue;
			}
		}

		return Coin.heads;
	}

	public static void allHeads(Coin[] myCoin) {
		for (int i = 0; i < myCoin.length; i++) {
			if (myCoin[i].getFace() == false) {
				myCoin[i].flip();
				myCoin[i].flips++;
			}
		}
	}

	public static void main(String[] args) {

		// create coins
		Coin[] myCoin = new Coin[500];
		for (int i = 0; i < 500; i++) {
			myCoin[i] = new Coin(false, 0);
		}

		displayFace(myCoin); // display falses 1

		System.out.println(); // reset line
		System.out.println("Flipping Randomly");
		randomflip(myCoin);
		displayFlips(myCoin); // should be 0s and 1s

		System.out.println(); // reset line
		System.out.println("Displaying Faces from Random Flip 1");
		displayFace(myCoin); // 2

		System.out.println("\n" + "Heads: " + countHeads(myCoin));

		System.out.println("Setting to all heads...");
		allHeads(myCoin);

		System.out.println("Displaying all heads...");
		displayFace(myCoin);

		System.out.println("Displaying Flips");
		displayFlips(myCoin);
		System.out.println();

		System.out.println("\n" + "Heads: " + countHeads(myCoin));

		System.out.println();

		randomflip(myCoin);
		System.out.println();
		displayFace(myCoin);
		displayFlips(myCoin);

		System.out.println();
		System.out.println("Heads: " + countHeads(myCoin));

	}

}
