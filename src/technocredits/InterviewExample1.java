package technocredits;
class InterviewExample1{
	
	int getCharFreqCount(String str, char targetCh){
		int count = 0;
		for(int index=0;index<str.length();index++){
			char ch = str.charAt(index);
			if(ch == targetCh)
				count++;
		}
		return count;
	}
	
	void printAllCharFreq(String input){
		int max = 0;
		char targetCh = ' ';
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int count = getCharFreqCount(input, ch);
			if(max<count) {
				max = count;
				targetCh = ch;
			}
		}
		if(max == 1) {
			System.out.println(input + " all characters are unique");
		}else {			
			System.out.println(input + " : " + targetCh + "->" + max);
		}
	}
	
	public static void main(String[] args) {
		InterviewExample1 interviewEx1 = new InterviewExample1();
		interviewEx1.printAllCharFreq("aakanksha");
		interviewEx1.printAllCharFreq("teecccchnoceredites");
		interviewEx1.printAllCharFreq("maulik");
	}
}