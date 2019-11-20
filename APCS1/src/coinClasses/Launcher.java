package coinClasses;

public class Launcher {

	public static void randomflip(Coin[] myCoin) {
		double rand;

		for (int i = 0; i < myCoin.length; i++) {
			rand = Math.random() * 10;
			if (rand <= 7) {
				myCoin[i].flip();
			}

		}

	}

	public static void displayFace(Coin[] myCoin) {
		System.out.println("\n");
		int z = 0;
		for (int i = 0; i < Coin.coinFaces.size(); i++) {
			if (z < 20) {
				System.out.print(Coin.coinFaces.get(i) + ", ");
				z++;
			} else if (z >= 20) {
				System.out.println();
				z = 0;
			}
		}
	}

	public static void displayFlips(Coin[] myCoin) {
		int x = 0;
		for (int i = 0; i < myCoin.length; i++) {
			if(x < 20 ) {
				System.out.print(myCoin[i].getFlips());
			} else if (x>=20) {
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

		displayFace(myCoin);

		System.out.println("\n");
		randomflip(myCoin);

		System.out.println("\n");
		displayFace(myCoin);

		System.out.println("\n" + "Heads: " + countHeads(myCoin));

		allHeads(myCoin);
		displayFace(myCoin);
		displayFlips(myCoin);
		System.out.println();

		System.out.println("\n" + "Heads: " + countHeads(myCoin));

		System.out.println();

		randomflip(myCoin);

		System.out.println();
		displayFace(myCoin);

		System.out.println();
		System.out.println("Heads: " + countHeads(myCoin));

	}

}
