package aanand;

// Input: Hello Hi Technocredits Pune
//Output:		Hello
//			   	   Hi
//		Technocredits
//               Pune

public class Assignment69 {

	int findMaxLengh(String[] str) {
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxLength < str[i].length()) {
				maxLength = str[i].length();
			}
		}
		return maxLength;
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
			int maxLength = findMaxLengh(arrWord);
			String output = getProcessWord(arrWord[i], maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		Assignment69 assignment69 = new Assignment69();
		assignment69.processData("Hello Hi Technocredits Pune");
		// assignment69.getProcessWord("Hello Hi Technocredits Pune");
	}
}