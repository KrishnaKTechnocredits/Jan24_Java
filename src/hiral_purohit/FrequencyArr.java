package hiral_purohit;

public class FrequencyArr{
	
	int getCharFrequency (String input, char targetCh) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == targetCh)
				count++;
		}
		return count;
	}
	
	void printFrequencyOfChar(String str) {
		int max = 0;
		char targetCh = ' ';
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int count = getCharFrequency(str, ch);
			if(max < count) {
				max = count;
				targetCh = ch; 
			}
		}if(max==1) {
			System.out.println(str+ " have all unique character." );
		}else	
			System.out.println(str + " -> " + targetCh + " -> " + max);
	}
	
	public static void main(String[] args) {
		FrequencyArr frequencyArr = new FrequencyArr();
		frequencyArr.printFrequencyOfChar("aakanksha");
		frequencyArr.printFrequencyOfChar("teecccchnoceredites");
		frequencyArr.printFrequencyOfChar("maulik");
	}

}
