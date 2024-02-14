package ankita_s;

import java.util.Arrays;

public class Assignment53 {

	void ArrangeNegAndPosNumber(int[] num) {
		int[] output = new int[num.length];
		int j = 0;
		for (int ne = 0; ne < num.length; ne++) {
			if (num[ne] < 0) {
				output[j] = num[ne];
				j++;
			}
		}

		for (int po = 0; po < num.length; po++) {
			if (num[po] > 0) {
				output[j] = num[po];
				j++;
			}
		}
		System.out.println("" + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		Assignment53 ass53 = new Assignment53();
		ass53.ArrangeNegAndPosNumber(arr);
	}
}
