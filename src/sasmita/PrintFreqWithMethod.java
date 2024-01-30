package sasmita;

public class PrintFreqWithMethod {

	void printWithMethodFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.print(str.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		PrintFreqWithMethod printwithm = new PrintFreqWithMethod();
		printwithm.printWithMethodFreq("technocredits");
	}
}
