package statistics;

public class Launcher {

	public static void main(String[] args) {
		int[] data;

		ReadCode reader = new ReadCode();
		data = reader.readCode("G:\\CS\\numbers.txt");

		System.out.println("Sum of Data Set: " + Statistics.calcSum(data));
		System.out.println("Average of Data Set: " + Statistics.calcAverage(data));
		System.out.println("Minimum of Data Set: " + Statistics.getMinimum(data));

		int[] sorteddata = Statistics.sortList(data);

		System.out.println("Mode of Data: " + Statistics.getMode(data));
		System.out.println("Median of Data: " + Statistics.getMedian(sorteddata));
		System.out.println("Standard Deviation of Data " + Statistics.getStanDev(sorteddata));

	}

}
