package arrays;

import java.util.Random;

public class ArrayReverse {

	static String l;

	public static void wrongReverse(int[] arr) {
		int[] b = new int[arr.length];
		System.out.println("\n");
		for (int i = arr.length - 1; i >= 0; i--) {
			b[i] = arr[arr.length - i - 1];
		}

		arr = b; // switching pointer does not switch entire array
	}

	public static void rightReverse(int[] arr) {
		int[] tmp = new int[arr.length];
		System.out.println("\n");

		for (int i = 0; i <= arr.length - 1; i++) {
			int z = arr[arr.length - i - 1];
			tmp[i] = z;
		}

		// write tmp back to arr
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = tmp[i];
		}

	}

	public static void goodReverse(int[] arr) {
		System.out.println("\n");
		int t;
		for (int i = 0; i < arr.length / 2; i++) {
			t = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = t;
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = new int[10];

		Random rand = new Random();
		int r;

		for (int i = 0; i < arr.length; i++) {
			r = rand.nextInt((20 - 11) + 11);
			arr[i] = r;
		}

		System.out.println("\n");
		System.out.println("Original Array ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		wrongReverse(arr);
		display(arr);

		rightReverse(arr);
		display(arr);

		goodReverse(arr);
		display(arr);

	}

}
