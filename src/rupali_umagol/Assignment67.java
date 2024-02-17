package rupali_umagol;

public class Assignment67 {

	// Program 1 ===============
	String getReverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	void printReveserString(String str) {
		String temp = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			temp = temp + getReverse(arr[i]) + " ";
		}
		System.out.println("Output of program 1 : " + temp);
	}

	// Program 2 Execution ============
	String getLetterCapital(String str) {
		str = str.toLowerCase().replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
		return str;

	}

	void printFirstLetterCapital(String str) {
		String result = "";
		String[] input = str.split(" ");
		for (int i = 0; i < input.length; i++) {
			String word = getLetterCapital(input[i]);
			result = result + word + " ";
		}
		System.out.println("Output of Program 2 : " + result);
	}
	// Program 3 ===========

	String getReverseUpperCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = getReverse(str);
			result = result.toLowerCase().replace(result.charAt(0), Character.toUpperCase(result.charAt(0)));
		}
		return result;
	}

	void printReverseAndFirstLetterCapital(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			temp = temp + getReverseUpperCase(arr[i]) + " ";
		}
		System.out.println("Output of Program 3 : " + temp);

	}

	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		// Program 1-------
		String input = "Hi Hello Maulik";
		System.out.println("##Program 1##");
		System.out.println("Input String : " + input);
		assignment67.printReveserString(input);
		// Program 2 ------------
		String input2 = "hi hEllO how are you";
		System.out.println("##Program 2##");
		System.out.println("Input String : " + input2);
		assignment67.printFirstLetterCapital(input2);
		// Program 3 ------------
		String input3 = "Hi Hello Maulik";
		System.out.println("##Program 3##");
		System.out.println("Input String : " + input3);
		assignment67.printReverseAndFirstLetterCapital(input3);
	}
}
