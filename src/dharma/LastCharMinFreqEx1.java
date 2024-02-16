package dharma;

public class LastCharMinFreqEx1 {

	int getCharFreq(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == c) {
				count++;
			}
		}
		return count;
	}
	
	void printLastCharWithMinFreq(String str) {
		for(int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			int getCharFreq = getCharFreq(str, ch);
			if(getCharFreq == 1) {
				System.out.println(ch + "->" + getCharFreq);
				break;
			}
		}
	}
	public static void main(String[] args) {
		String input = "aakanksha";
		LastCharMinFreqEx1 lastcharminfreqex1 = new LastCharMinFreqEx1();
		lastcharminfreqex1.printLastCharWithMinFreq(input);

	}

}
