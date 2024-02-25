package varsha;

//String str = "Hello Hi Technocredits Pune"
//Output = 
//        Hello
//           Hi
//Technocredits
//		   Pune

public class RightAlinement {

	int getMaxWordLength(String[] str) {
		int maxWordLength = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxWordLength < str[i].length()) {
				maxWordLength = str[i].length();
			}
		}
		return maxWordLength;
	}

	String getProcessString(String str, int maxWordLength) {
		int spaceRequired = maxWordLength - str.length();
		String output = "";
		for (int index = 0; index < spaceRequired; index++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}

	void getRightAlineProcessStr(String str) {
		String[] input = str.split(" ");
		int maxWordLength = getMaxWordLength(input);
		for (int index = 0; index < input.length; index++) {
			String output = getProcessString(input[index], maxWordLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String str = "Hello Hi Technocredits Pune";
		new RightAlinement().getRightAlineProcessStr(str);
	}
}