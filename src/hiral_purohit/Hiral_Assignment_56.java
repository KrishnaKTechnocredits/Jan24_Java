package hiral_purohit;
//Print only unique vowels:

//input: technocredits
//output: oi

public class Hiral_Assignment_56 {

	int toGetFrequencyOfChar(String str, char targetChar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	void toPrintPrimechar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = toGetFrequencyOfChar(str, ch);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if ((count % i == 1) && (str.indexOf(ch) == i)) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Hiral_Assignment_56().toPrintPrimechar("technocredits");
	}
}
