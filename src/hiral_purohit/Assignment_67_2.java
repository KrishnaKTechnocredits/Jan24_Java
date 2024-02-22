package hiral_purohit;

public class Assignment_67_2 {

	String toGetFirstLetterString(String str) {
		str = str.toLowerCase();
		char ch1 = ' ';
		String temp = " ";
		for (int i = 0; i < str.length(); i++) {
			ch1 = str.charAt(0);
		}
		temp = temp + Character.toUpperCase(ch1) + str.substring(1, str.length());
		return temp;
	}

	void toPrintUppercaseFirst(String str) {
		String output = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String input = toGetFirstLetterString(arr[i]);
			output = output + input + " ";
		}
		System.out.println(output.trim());
	}

	String toPrintReverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	void toPrintReverseUppercaseFirst(String str) {
		String output = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String input = toPrintReverseString(arr[i]);
			input = toGetFirstLetterString(input);
			output = output + input + " ";
		}
		System.out.println(output.trim());
	}

	public static void main(String[] args) {
		System.out.println("output for program 2: ");
		String str = "hi hEllO how are you";
		new Assignment_67_2().toPrintUppercaseFirst(str);
		String input = "Hi Hello Maulik";
		System.out.println("output for program 3: ");
		new Assignment_67_2().toPrintReverseUppercaseFirst(input);
	}

}
