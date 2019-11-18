package coinClasses;

public class Launcher {

	public static void randomflip(Coin[] myCoin) {
		for (int i = 0; i < myCoin.length; i++) {
			double rand = Math.random() * 10;
			if (rand < 4) {
				myCoin[i].flip();
				Coin.flips++;
				Coin.coinFaces.add(myCoin[i].getFace());
				if ((myCoin[i].getFace()).toString() == "true") {
					Coin.heads++;
				} else if ((myCoin[i].getFace()).toString() == "false") {
					Coin.tails++;
				}
			} else {
				Coin.coinFaces.add(myCoin[i].getFace());
			}
		}
	}

	public static void displayFace(Coin[] myCoin) {
		System.out.println();
		for (int i = 0; i < myCoin.length; i++) {
			System.out.print(myCoin[i].getFace().toString() + ", ");
		}
	}

	public static void displayFlips(Coin[] myCoin) {
		for (int i = 0; i < myCoin.length; i++) {

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
		Coin.coinFaces.clear();

		for (int i = 0; i < myCoin.length; i++) {
			if ((myCoin[i].getFace().toString() != "true")) {
				myCoin[i].flip();
			}
		}

		for (int i = 0; i < myCoin.length; i++) {
			Coin.coinFaces.add(myCoin[i].getFace());
		}

	}

	public static void main(String[] args) {
		Coin[] myCoin = new Coin[500];

		for (int i = 0; i < 500; i++) {
			myCoin[i] = new Coin(false, 0);
			Coin.coins.add(myCoin[i]);
			Coin.coinFaces.add(myCoin[i].getFace());
		}

		System.out.println(Coin.coinFaces);

		Coin.coinFaces.clear();

		randomflip(myCoin);

		System.out.println("\n" + Coin.coinFaces);
		System.out.println("\n" + "Heads: " + countHeads(myCoin));
		System.out.println("Flips: " + Coin.flips);

		Coin.flips = 0;
		allHeads(myCoin);
		System.out.println(Coin.coinFaces);

		System.out.println("\n" + "Heads: " + countHeads(myCoin));
		System.out.println("\n" + "Flips: " + Coin.flips);

		Coin.flips = 0;
		randomflip(myCoin);
		displayFace(myCoin);
		System.out.println("\n");
		System.out.println("Heads: " + countHeads(myCoin));
		System.out.println("Flips: " + Coin.flips);
		
	}

}
