package sasmita;

public class Assignment72 {
	int maxLength = 0;

	int getMaxLength(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxLength) {
				maxLength = arr[index].length();
			}
		}
		return maxLength;
	}

	String getWord(String word, int maxLength) {
		String output = "";
		int requiredSpace = maxLength - word.length();
		for (int index = 0; index < requiredSpace; index++) {
			output = output + " ";

		}
		output = output + word;
		return output;
	}

	String getSumofDigits(String str) {
		int sum = 0;
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		str1 = str + " " + sum;
		return str1;

	}

	void processData(String input) {
		String output = getSumofDigits(input);
		String[] str = output.split(" ");
		int maxLength = getMaxLength(str);
		for (int i = 0; i < str.length; i++) {
			String str1 = getWord(str[i], maxLength);
			System.out.println(str1);

		}

	}

	public static void main(String[] args) {

		Assignment72 assignment72 = new Assignment72();
		assignment72.processData("Hel6lo Hi T4ech3noc2redits Pu1ne");
	}
}
