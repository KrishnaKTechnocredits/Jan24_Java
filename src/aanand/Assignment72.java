package aanand;

//	Input		H5el6lo Hi Tech3noc2redits Pu1ne
//	Output:		Hello
//			       Hi
//		Technocredits
//				 Pune
//                 17
public class Assignment72 {

	int getMaxLength(String[] str) {
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxLength < str[i].length()) {
				maxLength = str[i].length();
			}
		}
		return maxLength;
	}

	int getSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				sum = sum + temp;
			}
		}
		return sum;
	}

	String removeNumberFromString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				str.replace(String.valueOf(ch), "");
			} else
				output = output + ch;
		}

		return output;
	}

	String getProcessWord(String input, int length) {
		int requiredSpace = length - input.length();
		String output = "";
		for (int i = 0; i < requiredSpace; i++) {
			output = output + " ";
		}
		output = output + input;
		return output;
	}

	void processData(String str) {
		int maxLength = 0;
		int sum = getSum(str);
		String removeNumber = removeNumberFromString(str);
		String[] arrWord = removeNumber.split(" ");
		for (int i = 0; i < arrWord.length; i++) {
			maxLength = getMaxLength(arrWord);
			String processWord = getProcessWord(arrWord[i], maxLength);
			System.out.println(processWord);
		}
		String sumOfNum = getProcessWord(Integer.toString(sum), maxLength);
		System.out.println(sumOfNum);
	}

	public static void main(String[] args) {
		Assignment72 assignment70 = new Assignment72();
		assignment70.processData("H5el6lo Hi Tech3noc2redits Pu1ne");
	}
}