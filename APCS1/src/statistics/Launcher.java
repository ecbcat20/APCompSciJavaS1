package statistics;

public class Launcher {

	public static void main(String[] args) {
		int[] data;

		ReadCode reader = new ReadCode();
		data = reader.readCode("D:\\CS\\numbers.txt");

		Statistics stat1 = new Statistics();
		System.out.println("Sum of Data Set: " + stat1.calcSum(data));
		System.out.println("Average of Data Set: " + stat1.calcAverage(data));
		System.out.println("Minimum of Data Set: " + stat1.getMinimum(data));

		int[] sorteddata = stat1.sortList(data);

		System.out.println("Mode of Data: " + stat1.getMode(data));
		System.out.println("Median of Data: " + stat1.getMedian(sorteddata));
		System.out.println("Standard Deviation of Data " + stat1.getStanDev(sorteddata));

	}

}
