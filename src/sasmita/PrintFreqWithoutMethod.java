package sasmita;

public class PrintFreqWithoutMethod {

	void printFreq(String str) {
		int count = 0;
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		PrintFreqWithoutMethod print = new PrintFreqWithoutMethod();
		print.printFreq("technocredits");
	}
}
