package shravani_rapelli;

public class Assignment60 {
	
	int getCharacterCount(String str, char targetCh) {
		int count =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch==targetCh)
				count++;
		}
		return count;
	}
	
	char maxCharFreqChar(String str) {
		int max=0;
		char maxChar=' ';
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			int getCharacterCount = getCharacterCount(str,ch);
			if(getCharacterCount>max) {
				max=getCharacterCount;
				maxChar=ch;
			}
		}
		return maxChar;
	}
	
	public static void main(String[] args) {
		Assignment60 assign60 = new Assignment60();
		String str = "aakanksha";
		char maxChar = assign60.maxCharFreqChar(str);
		str=str.replace(Character.toString(maxChar), "");
		maxChar = assign60.maxCharFreqChar(str);
		int freq = assign60.getCharacterCount(str, maxChar);
		System.out.println(maxChar + "->" + freq);

	}
	
}
