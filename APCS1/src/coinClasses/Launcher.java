package coinClasses;

public class Launcher {

	public static void randomflip(Coin[] myCoin) {
		for(int i = )
		double rand = Math.random()*10;
		if(rand<4) {
			myCoin[i].flip();
		}
	}

	public static void displayFace(Coin[] myCoin) {

	}

	public static void displayFlips(Coin[] myCoin) {

	}

	public static int countHeads(Coin[] myCoin) {
		int heads = 10;
		return heads;
	}

	public static void allHeads(Coin[] myCoin) {

	}

	public static void main(String[] args) {
		Coin[] myCoin = new Coin[500];

		for (int i = 0; i < 500; i++) {
			myCoin[i] = new Coin(false, 0);
			Coin.coins.add(myCoin[i]);
			Coin.coinFaces.add(myCoin[i].getFace());
		}

		System.out.println(Coin.coins);
		System.out.println(Coin.coinFaces);

	}

}
