package unitThreeClasses;

import java.util.Random;

public class CoinTest {

	public static void main(String[] args) {

		Coin aCoin = new Coin(true);
		Coin bCoin = new Coin(false);

		System.out.println("The value of aCoin is: " + aCoin.toString());

		// flip aCoin
		// output its state

		aCoin.flip();
		System.out.println("The value of aCoin is: " + aCoin.toString());

		// check for isHeads of bCoin
		// flip bCoin
		// check isHeads again of bCoin

		System.out.println("The value of bCoin is: " + bCoin.toString());

		bCoin.flip();

		System.out.println("The value of bCoin is: " + bCoin.toString());

		// generate a random number between 1 and 10.
		// flip bCoin that many times.
		// each time outpt its state after flip.

		Random rand = new Random();
		int min = 1, max = 10;
		int randomNum = rand.nextInt((max - min) + 1) + min;

		for (int i = 0; i < randomNum; i++) {
			bCoin.flip();
			System.out.println(bCoin.toString());

		}

	}

}
