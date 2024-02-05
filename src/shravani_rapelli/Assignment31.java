package shravani_rapelli;

public class Assignment31 {
	
	int getCharFrequencyCount(String str, char targetCh) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch== targetCh)
				count++;
		}
		return count;
	}
	
	void printAllCharFreq(String input) {
		int max =0;
		char targetCh=' ';
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFrequencyCount(input, ch);
			if(max<count) {
				max = count;
				targetCh = ch;
			}
		}
		System.out.println(input + " -> "+ targetCh + " -> " + max);
	}
	
	public static void main(String[] args) {
		Assignment31 assign31 = new Assignment31();
		assign31.printAllCharFreq("aakanksha");
		assign31.printAllCharFreq("teecccchnoceredites");
	}

}
