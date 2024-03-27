package shramika_vaidya;

import java.util.Arrays;

public class ShiftAllZerosAtEnd {

	void printZerosAtEnd(int[] arr) {
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				str1 += arr[i] + " ";
			} else
				str2 += arr[i] + " ";
		}
		String str = str1 + str2;
		String[] str3 = str.split(" ");
		System.out.println(Arrays.toString(str3));
	}

	void printZerosAtStart(int[] arr) {
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				str1 += arr[i] + " ";
			} else
				str2 += arr[i] + " ";
		}
		String str = str2 + str1;
		String[] str3 = str.split(" ");
		System.out.println(Arrays.toString(str3));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		ShiftAllZerosAtEnd shiftAllZerosAtEnd = new ShiftAllZerosAtEnd();
		shiftAllZerosAtEnd.printZerosAtEnd(arr);
		System.out.println("----------------------------------------");
		shiftAllZerosAtEnd.printZerosAtStart(arr);
	}

}
