package statistics;

public class Statistics {

	static long sum, avg, stanDev = 0;
	static int min, max, med, mod;

	static ReadCode reader = new ReadCode();

	public static long calcSum(int[] data) {
		for (int i = 0; i < 1039; i++) {
			sum += data[i];
		}

		return sum;
	}

	public static double calcAverage(int[] data) {
		avg = (sum / 1039);
		return avg;
	}

	public static int getMinimum(int[] data) {
		int localmin = 1;

		for (int i = 0; i < 1039; i++) {
			if (data[i] <= localmin) {
				min = data[i];
			}
		}

		return min;
	}

	public static int getMaximum(int[] data) {
		int localMax = 1;

		for (int i = 0; i < 1039; i++) {
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
		// use sorteddata as parameter for this
		med = data[1039 / 2];
		return med;
	}

	public static int getMode(int[] data) {
		int freq[] = new int[1039];

		for (int i = 0; i < data.length; i++) {
			freq[data[i]]++;
		}

		int max = 0;
		for (int i = 0; i < data.length; i++) {
			if (freq[i] > max) {
				max = data[i];
			}
		}

		mod = max;
		return mod;
	}

	public static double getStanDev(int[] data) {
		
		
		return stanDev;
	}

}
