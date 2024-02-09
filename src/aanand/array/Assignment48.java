package aanand.array;

public class Assignment48 {

	String extractAllDigitAndSpecialCharFromString(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
				ans = ans + ch;
			}
		}
		return ans;
	}

	void print(String str) {
		String output = extractAllDigitAndSpecialCharFromString(str);
		System.out.println(output);

	}

	public static void main(String[] args) {
		Assignment48 assignment48 = new Assignment48();
		assignment48.print("Aas-H3v7i");
	}
}