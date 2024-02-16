package rohini_deshmane.string_programs;
/*
 * Assignment - 60 : 14th Feb'2024
"Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */

public class SecondMaxFrequencyOfChar {
	
	int getCharCount(String str, char ch) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	boolean isProcessed(String str, char ch, int targetIndex) {
		boolean flag = false;
		for(int i=0; i< targetIndex; i++) {
			if(str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
				flag = true;
			}
		}
		return flag;
	}
	
	void printSecondMaxFreq(String str) {
		int count=0, maxCount=0;
		char ch=' ';
		for(int i=0; i<str.length(); i++) {
			if(!isProcessed(str, str.charAt(i),i)) {
				count = getCharCount(str, str.charAt(i));
				if(count > maxCount) {
					maxCount = count;
					ch = str.charAt(i);
				}
			}
		}
		System.out.println(ch + " --> "+maxCount);
	}
	
	void printMaxFreq(String str) {
		int count=0, maxCount=1;
		
		for(int i=0; i<str.length(); i++) {
			if(!isProcessed(str, str.charAt(i),i)) {
				count = getCharCount(str, str.charAt(i));
				if(count >= maxCount) {
					maxCount = count;
					str = str.replace(Character.toString(str.charAt(i)), "");
				}
			}
		}
		printSecondMaxFreq(str);
	}
	
	public static void main(String[] args) {
		SecondMaxFrequencyOfChar secondFre = new SecondMaxFrequencyOfChar();
		secondFre.printMaxFreq("aakankshhhha");
	}

}
