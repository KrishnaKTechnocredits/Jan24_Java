package gaurav_garg;

public class Programming_Test_2b {

	boolean nonRepeataiveCharcter(String str, char c) {
		int i = str.indexOf(c);
		int j = str.lastIndexOf(c);
		if (i == j) {
			return true;
		}
		return false;
	}

	void printLastConstantValueNonRepatative(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			boolean answer = nonRepeataiveCharcter(str, c);
			if (answer == true) {
				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					System.out.print(c);
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		new Programming_Test_2b().printLastConstantValueNonRepatative("aakanschhe");
	}
}
