package shafaque;

public class Assignment87 {
	String getReverseWord(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--)
			output = output + str.charAt(i);
		return output;
	}

	String printReverseStr(String str) {
		String[] arr = str.split(" ");
		String str1 = "";
		for (String word : arr) {
			String output = getReverseWord(word);
			str1 = str1 + output + " ";
		}
		str1 = str1.trim();
		return str1;
	}

	public static void main(String[] args) {
		System.out.println(new Assignment87().printReverseStr("Welcome to Technocredits"));
	}
}
