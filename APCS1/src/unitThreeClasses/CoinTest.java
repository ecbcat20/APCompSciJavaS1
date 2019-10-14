package unitThreeClasses;

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
	}

}
