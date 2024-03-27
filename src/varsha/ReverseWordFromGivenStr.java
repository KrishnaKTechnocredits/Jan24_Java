package varsha;

//Code to reverse words in string:
//	 Input: Welcome to Technocredits
//	 Output: emocleW ot stiderconhceT

public class ReverseWordFromGivenStr {

	String reverseWord(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--)
			output = output + str.charAt(i);
		return output;
	}

	String getReverseStr(String str) {
		String[] arr = str.split(" ");
		String str1 = "";
		for (String word : arr) {
			String output = reverseWord(word);
			str1 = str1 + output + " ";
		}
		str1 = str1.trim();
		return str1;
	}

	public static void main(String[] args) {
		System.out.println(new ReverseWordFromGivenStr().getReverseStr("Welcome to Technocredits"));
	}
}
