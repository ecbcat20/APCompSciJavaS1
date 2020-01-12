package searchingAndSorting;

public class BinarySearch {

	// Binary searches work by finding the key by using the powers of two.
	// Essentially, if the element is not in the middle, either go to the left or
	// right, and if it's not there, keep going to midpoint of the next data section
	// until you find what you're looking for.

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;

		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		if (first > last) { // element would not be in list
			System.out.println("Element is not found!");
		}

	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 10;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}
}