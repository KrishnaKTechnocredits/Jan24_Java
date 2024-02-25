package aanand;

//	Input		H5el6lo Hi Tech3noc2redits Pu1ne
//	Output: 	45Hello
//					 Hi
//		32Technocredits
//				  1Pune
public class Assignment70 {

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
		String numString = "";
		String charString = "";
		String finalString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				numString = numString + ch;
			} else
				charString = charString + ch;
		}
		finalString = numString + charString;
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
			int maxLength = getMaxLength(arrWord);
			String processWord = wordProcessWord(arrWord[i]);
			String output = getProcessWord(processWord, maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		Assignment70 assignment70 = new Assignment70();
		assignment70.processData("H5el6lo Hi Tech3noc2redits Pu1ne");
	}
}