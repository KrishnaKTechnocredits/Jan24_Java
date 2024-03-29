package dharma;

public class Assignment88 {

	String getReverseString(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output = output + str.charAt(i);
		}
		return output;
	}

	void printReverseFirstLastString(String[] arr) {
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length - 1) {
				String result = getReverseString(arr[i]);
				output = output + result + " ";
			} else {
				output = output + arr[i] + " ";
			}
		}
		output = output.trim();
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment88 ass88 = new Assignment88();
		String str = "Welcome to the Technocredits";
		String[] str1 = str.split(" ");
		ass88.printReverseFirstLastString(str1);
	}
}
