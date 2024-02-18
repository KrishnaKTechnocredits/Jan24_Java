package varsha;

import java.util.Arrays;

public class Pallindrone {

	String getreverseStr(String str) {
		String input = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			input = input + str.charAt(i);
		}
		return input;
	}

	String[] getNonPallindrone(String[] arr) {
		String[] str = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String input = getreverseStr(arr[i]);
			if (input.equals(arr[i])) {
				str[i] = arr[i];
			} else
				input = input.toUpperCase().charAt(0) + input.substring(1, input.length() - 1)
						+ input.toUpperCase().charAt(input.length() - 1);
			str[i] = input;
		}
		return str;
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		String[] str = new Pallindrone().getNonPallindrone(arr);
		System.out.println(Arrays.toString(str));
	}
}