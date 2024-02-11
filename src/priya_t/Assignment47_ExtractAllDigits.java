//Return the string extracting all the digits from it.
package priya_t;

public class Assignment47_ExtractAllDigits {

	public String getAllDigit(String str) {
		int sum = 0;
		String digits = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				digits = digits + ch;
		}
		System.out.println("Extract all Digits from Given String is:" + digits);
		return digits;
	}

	public static void main(String[] args) {
		String str = "Aas-H3v7i";
		Assignment47_ExtractAllDigits obj = new Assignment47_ExtractAllDigits();
		obj.getAllDigit(str);
	}
}
