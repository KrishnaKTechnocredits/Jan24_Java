package dharma;

public class MaxFreqEx1 {

	int getCharFreqCount(String str, char targetCh) {
		int count = 0;
		for(int index=0;index<str.length();index++) {
			char ch =str.charAt(index);
			if(ch == targetCh)
				count++;
		}
		return count;
		
	}
	
	void printAllCharFreq(String input) {
		int max = 0;
		char targetCh = ' ';
		boolean flag = false;
		
		for(int index=0;index<input.length();index++) {
			char ch =input.charAt(index);
			int count = getCharFreqCount(input,ch);
			
			if(max < count) {
				max = count;
				targetCh = ch;
				flag = true;
			}else if(max==1){
				flag = false;
			}
		}
		if(flag == true)
		System.out.println(input +":" +targetCh + "->" + max);
		if(max==1)
		System.out.println(input + "-> having all unique characters");
	}
	public static void main(String[] args) {
		MaxFreqEx1 maxfreqex1 = new MaxFreqEx1();
		maxfreqex1.printAllCharFreq("aakanksha");
		maxfreqex1.printAllCharFreq("teecccchnoceredites");
		maxfreqex1.printAllCharFreq("maulik");

	}

}
