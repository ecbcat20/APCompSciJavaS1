package searchingAndSorting;

public class WangBinarySearch {

	// source represents array of doubles, key represents number to find

	public static boolean binarySearch(double[] source, double key) {
		int last = source.length - 1;
		int first = 0;

		int mid = (first + last) / 2;
		int count = 0;

		while (first <= last) {
			count++;

			if (source[mid] < key) {
				first = mid + 1;
			} else if (source[mid] > key) {
				last = mid - 1;
			} else {
				System.out.println("compared " + count + " times");
				return true;
			}
			mid = (first + last) / 2;
		}

		System.out.println("compared " + count + " times");
		return false;
	}

}
