package shafaque;

import java.util.Arrays;

public class Assignment91 {
	void shiftAllZerosAtEnd(int[] arr) {
		String str0 = "";
		String str1 = "";
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				str0 += arr[i] + " ";
			else if (arr[i] != 0)
				str1 += arr[i] + " ";
		}
		str = str1 + str0;
		str.trim();
		String[] output = str.split(" ");
		System.out.println("Shifting all zeros at the end: ");
		System.out.println(Arrays.toString(output));
	}

	void shiftAllZerosAtBeginning(int[] num) {
		String str0 = "";
		String str1 = "";
		String str = "";
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0)
				str0 += num[i] + " ";
			else if (num[i] != 0)
				str1 += num[i] + " ";
		}
		str = str0 + str1;
		str.trim();
		String[] output = str.split(" ");
		System.out.println("Shifting all zeros at the beginning: ");
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		Assignment91 ass91 = new Assignment91();
		ass91.shiftAllZerosAtEnd(input);
		ass91.shiftAllZerosAtBeginning(input);
	}
}
