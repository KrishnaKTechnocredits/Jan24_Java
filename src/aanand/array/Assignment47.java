package aanand.array;

public class Assignment47 {

	String extractAllDigitFromString(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				ans = ans + ch;
			}
		}
		return ans;
	}

	void print(String str) {
		String output = extractAllDigitFromString(str);
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment47 assignment47 = new Assignment47();
		assignment47.print("Aas-H3v7i");
	}
}