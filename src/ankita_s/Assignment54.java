package ankita_s;

import java.util.Arrays;

public class Assignment54 {

	void getZeroAtEnd(int[] num) {
		int[] output = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0 || num[i] > 0) {
				output[j] = num[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		Assignment54 ass54 = new Assignment54();
		ass54.getZeroAtEnd(arr);
	}
}
