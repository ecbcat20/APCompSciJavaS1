package basics;

public class KirasLottery {

	static int numberAmount = 2;
	static String sWinningNums;
	static int lotteryNumberDigit;

	static double lotto;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i<=numberAmount; i++) {
			lotto = Math.random();
			for(int j = i; j<numberAmount; j++) {
				lotto = Math.random();
				lotteryNumberDigit = (int) (lotto*10);
				sWinningNums = Integer.toString(lotteryNumberDigit);
				System.out.println(sWinningNums);
				
			}

		}

	}

}
