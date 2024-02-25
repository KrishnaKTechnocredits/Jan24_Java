package shramika_vaidya;

import java.util.Arrays;

public class PrintAllTheZerosAtTheEnd {

	void getAllDigitPrintedBeforeZero(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[j] = input[i];
				j++;
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				output[j] = input[i];
				j++;
			}
		}
		String str = Arrays.toString(output);
		str = str.replace('[', '{').replace(']', '}');
		System.out.println(str);
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		new PrintAllTheZerosAtTheEnd().getAllDigitPrintedBeforeZero(arr);
	}
}
