package technocredits.interview;

import java.util.Arrays;

public class Test {
	String strReverse(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String processInput(String input) {
		char ch1 = input.charAt(0);
		char ch2 = input.charAt(input.length() - 1);

		input = Character.toUpperCase(ch1) + input.substring(1, input.length() - 1) + Character.toUpperCase(ch2);
		return input;
	}

	String[] processArr(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String input = arr[index];
			String output = strReverse(input);
			if (!input.equals(output)) {
				arr[index] = processInput(output);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		Test test = new Test();
		arr = test.processArr(arr);
		System.out.println(Arrays.toString(arr));
	}

}
