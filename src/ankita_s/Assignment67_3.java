package ankita_s;

public class Assignment67_3 {
	String reverseWord(String str) {
		String output = "";
		for (int index = (str.length() - 1); index >= 0; index--) {
			output += str.charAt(index);
		}
		return output;
	}

	String reverseWholeString(String input) {
		String output = "";
		String[] strArr = input.split(" ");
		for (int index = 0; index < strArr.length; index++) {
			output += reverseWord(strArr[index]) + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		String output = new Assignment67_3().reverseWholeString(input);
		System.out.println("Input : " + input);
		System.out.println("Output : " + output);

	}
}
