package hiral_purohit;

public class Assignment_69 {

	int toGetMaxLength(String[] arr) {
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxLength < arr[i].length()) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}

	String toGetOutputString(String str, int maxLength) {
		int requiredSpace = maxLength - str.length();
		String output = "";
		for (int i = 0; i < requiredSpace; i++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}

	void printProcessedString(String str) {
		String[] arr = str.split(" ");
		int maxLength = toGetMaxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			String output = toGetOutputString(arr[i], maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String str = "Hello Hi Technocredits Pune";
		new Assignment_69().printProcessedString(str);
	}

}
