package statistics;

public class Statistics {

	static long sum, avg, stanDev = 0;
	static int min, max, med, mod;

	static ReadCode reader = new ReadCode();

	public static long calcSum(int[] data) {
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}

		return sum;
	}

	public static double calcAverage(int[] data) {
		avg = (sum / data.length);
		return avg;
	}

	public static int getMinimum(int[] data) {
		int localmin = 1;

		for (int i = 0; i < data.length; i++) {
			if (data[i] <= localmin) {
				min = data[i];
			}
		}

		return min;
	}

	public static int getMaximum(int[] data) {
		int localMax = 1;

		for (int i = 0; i < data.length; i++) {
			if (data[i] > localMax) {
				max = data[i];
			}
		}

		return max;
	}

	public static int[] sortList(int[] data) { // insertion sorting algorithm
		int n = data.length;
		for (int i = 1; i < n; ++i) {
			int key = data[i];
			int j = i - 1;

			while (j >= 0 && data[j] > key) {
				data[j + 1] = data[j];
				j = j - 1;
			}

			data[j + 1] = key;
		}

		return data;
	}

	public static int getMedian(int[] data) {
		// use sorteddata as parameter for this (relies on having sorted data to
		// function)
		med = data[data.length / 2];
		return med;
	}

	public static int getMode(int[] data) {
		int freq[] = new int[data.length]; // create a temp array with same dimensions as input array

		for (int i = 0; i < data.length; i++) { // populate temp array with frequency values from input array
			freq[data[i]]++;
		}

		int max = 0; // basic code to find max value in an array
		for (int i : data) {
			if (freq[i] > max) {
				max = data[i];
			}
		}

		mod = max;
		return mod;
	}

	public static double getStanDev(int[] data) {
		double av = avg;
		int sumdiffsq = 0;

		for (int i = 0; i < data.length; i++) {
			sumdiffsq += (Math.pow(data[i] - av, 2)); // standard deviation formula part 1
		}

		double val2 = (sumdiffsq / (data.length - 1)); // standard deviation formula part 2
		stanDev = (long) Math.sqrt(val2);

		return stanDev;
	}

}
