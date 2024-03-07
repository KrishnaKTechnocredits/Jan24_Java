package aanand;

/*Print last character with minimum frequency:
input: aakanksha
output: h->1*/

public class Assignment58 {
	int getlastCharWithMinFrequency(String str, char targetChar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	void printlastCharWithMinFrequency(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			int output = getlastCharWithMinFrequency(str, ch);
			if (output == 1) {
				System.out.println(ch + " -> " + output);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		assignment58.printlastCharWithMinFrequency("aakanksha");
	}
}