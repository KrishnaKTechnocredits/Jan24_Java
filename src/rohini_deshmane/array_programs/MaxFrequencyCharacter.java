package rohini_deshmane.array_programs;

public class MaxFrequencyCharacter {
	
	int countOfCharFromString(String str, char targetCh) {
		int count=0;
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == targetCh) {
				count++;
			}
		}
		return count;
	}
	
	void printmaxFrequencyChar(String str) {
		int count=0, maxCount=0;
		char ch, newCh=' ';
		for(int index =0; index <str.length(); index++) {
			ch = str.charAt(index);
			count = countOfCharFromString(str, ch);
			if(count > maxCount) {
				maxCount = count;
				newCh = ch;
			}
		}
		System.out.println(str+" -->  "+newCh+" --> "+maxCount);
	}
	
	public static void main(String[] args) {
		MaxFrequencyCharacter maxFrechar = new MaxFrequencyCharacter();
		maxFrechar.printmaxFrequencyChar("teecccchnoceredites");
	}

}
