package dharma;

public class Assignment71 {

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
		int sum=0;
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			} else {
				str1 = str1 +ch ;
			}
		}
		return (sum + str1);
	}

	void processData() {
		String input = "He5l2lo Hi Techn3ocr2edits Pu1ne";
		String[] arr = input.split(" ");
		int maxLength = getMaxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			String str = getSumofDigits(arr[i]);
			String output = getWord(str, maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		Assignment71 assignment71 = new Assignment71();
		assignment71.processData();
	}
}

