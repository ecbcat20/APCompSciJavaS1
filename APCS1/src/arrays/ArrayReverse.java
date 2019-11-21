package arrays;

import java.util.Random;

public class ArrayReverse {

	static int arr[] = new int[10];

	public static void wrongReverse(int[] arr) {

		int[] b = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			b[i] = arr[i];
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int r;

		for (int i : arr) {
			r = rand.nextInt((20 - 11) + 11);
			arr[i] = r;
			System.out.println(arr[i]);
		}

		System.out.println("\n");

		for (int i : arr) {
			System.out.println(arr[i]);
		}

	}

}
