package dharma;

public class CharWithSecondHighestFreqEx1 {

	int getCharFreq(String str, char ch) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			String str1 = str.toLowerCase();
			char ch1 = str1.charAt(i);
			if(ch1 == ch) {
				count++;
			}
		}
		return count;
	}
	
	char maxCharFreq(String str) {
		int count = 0;
		int count1 = 0;
		char ch = ' ';
		for(int i = 0; i < str.length(); i++) {
			String str2 = str.toLowerCase();
			char ch2 = str2.charAt(i);
			if(ch2 == str2.charAt(i)) {
				count = getCharFreq(str, str.charAt(i));
				if(count > count1) {
					count1 = count;
					ch = ch2;
				}
			}
		}
		return ch;
	}
	
	void secondMaxChar(String input) {
		char ch = maxCharFreq(input);
		input = input.replace(Character.toString(ch),"");
		ch = maxCharFreq(input);
		System.out.println(ch + "->" + getCharFreq(input, ch));
	}
	
	public static void main(String[] args) {
		new CharWithSecondHighestFreqEx1().secondMaxChar("aakanksha");

	}

}
