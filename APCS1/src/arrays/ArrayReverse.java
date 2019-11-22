package arrays;

import java.util.Random;

public class ArrayReverse {

	static int arr[] = new int[10];
	static String s = "";
	static String y = "";
	static String l = "";

	public static void wrongReverse(int[] arr) {
		System.out.println("\n");

		int[] b = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			b[i] = arr[i];
			s += b[i] + " ";
		}
	}

	public static void rightReverse(int[] arr) {
		System.out.println("\n");
		int[] tmp = new int[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			int z = arr[arr.length - i - 1];
			tmp[i] = z;
			y += tmp[i] + " ";
		}
	}

	public static void goodReverse(int[] arr) {
		System.out.println("\n");
		for (int i = 0; i <= arr.length - 1; i++) {
			int z = arr[arr.length - i - 1];
			l += z + " ";
		}
	}

	public static void display(int[] arr) {
		if() {
			System.out.println(s);
		} else if() {
			System.out.println(y);
		} else if() {
			System.out.println(l);
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

		wrongReverse();
		rightReverse();
		goodReverse();
	}

}
