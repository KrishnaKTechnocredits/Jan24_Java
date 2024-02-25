package aanand;

//	Input		H5el2lo Hi Tech3noc2redits Pu1ne
//	Output:		7Hello
//			       0Hi
//		5Technocredits
//				 1Pune
public class Assignment71 {

	int getMaxLength(String[] str) {
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxLength < str[i].length()) {
				maxLength = str[i].length();
			}
		}
		return maxLength;
	}

	String wordProcessWord(String str) {
		int sum = 0;
		String charString = "";
		String finalString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			} else
				charString = charString + ch;
		}
		finalString = "" + sum + charString;
		return finalString;
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
		String[] arrWord = str.split(" ");
		for (int i = 0; i < arrWord.length; i++) {
			String processWord = wordProcessWord(arrWord[i]);
			int maxLength = getMaxLength(arrWord);
			String output = getProcessWord(processWord, maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		Assignment71 assignment70 = new Assignment71();
		assignment70.processData("H5el2lo Hi Tech3noc2redits Pu1ne");
	}
}