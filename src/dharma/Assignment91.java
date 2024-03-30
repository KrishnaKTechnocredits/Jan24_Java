package dharma;

import java.util.Arrays;

public class Assignment91 {

	void printZeroAtEnd(int[] arr) {
		int[] num = new int[arr.length];
		int j = 0;
		int k = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				num[j] = arr[i];
				j++;
			} else if (arr[i] == 0) {
				num[k] = arr[i];
				k--;
			}
		}
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		Assignment91 ass91 = new Assignment91();
		int[] arr = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		ass91.printZeroAtEnd(arr);
	}
}
