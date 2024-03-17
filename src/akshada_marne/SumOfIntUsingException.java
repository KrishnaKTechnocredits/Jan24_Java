package akshada_marne;

import java.util.Arrays;

public class SumOfIntUsingException {
	void sumOfInt(String[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			try {
				sum = sum + Integer.parseInt(input[i]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println(sum);
	}

	public static void main(String args[]) {

		SumOfIntUsingException sumOfIntUsingException = new SumOfIntUsingException();
		String str = "I am having 11 years and 3 months of experience in java selenium";

		String arr[] = str.split(" ");
		sumOfIntUsingException.sumOfInt(arr);
	}

}
