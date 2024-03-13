package sasmita;

import java.util.Arrays;

public class Programmingtest4test {

	void devdeArray(int[] arr) {
		int length = arr.length / 2;
		int[] num1 = new int[length];
		int[] num2 = new int[length];
		int index = 0;
		for (int i = 0; i < num1.length; i++) {
			num1[i] = arr[i];
			index++;

		}
		for (int i = 0; i < num2.length; i++) {
			num2[i] = arr[index];
			index++;
		}
		getsumofArray(num1, num2);
	}

	void getsumofArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i] + arr2[i];
		}
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));
		System.out.println("Sum of Array elements : " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] num = { 1, 10, 20, 12, 15, 6 };
		Programmingtest4test pr = new Programmingtest4test();
		pr.devdeArray(num);
	}

}
