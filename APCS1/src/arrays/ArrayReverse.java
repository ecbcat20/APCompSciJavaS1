package arrays;

import java.util.Random;

public class ArrayReverse {

	static int arr[] = new int[10];

	public static void wrongReverse(int[] arr) {
		System.out.println("\n");
		int[] b = new int[arr.length];
		for (int i = arr.length - 1; i > 0; i--) {
			b[i] = arr[i];
			System.out.print(b[i] + " ");
		}
	}

	public static void rightReverse(int[] arr) {
		System.out.println("\n");
		int[] tmp = new int[10];
		for (int i = 1; i < arr.length; i++) {
			int z = arr[arr.length - i];
			tmp[i] = z;
			System.out.print(tmp[i] + " ");
		}
	}

	public static void goodReverse(int[] arr) {
		System.out.println("\n");
		for (int i = 1; i < arr.length; i++) {
			int z = arr[arr.length - i];
			System.out.print(z + " ");
		}
	}

	public static void main(String[] args) {
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
		rightReverse(arr);
		goodReverse(arr);

	}

}
