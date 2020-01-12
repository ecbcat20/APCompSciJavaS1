package searchingAndSorting;

public class LinearSearch {

	public static int linearSearch(double[] arr, double key) {
		int index = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == key) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		double[] arr = { 1.0, 2.0, 10.0, 14.0, 17.0, 20.0 };
		double key = 10.0;

		System.out.println("Found at: " + linearSearch(arr, key));
	}

}
