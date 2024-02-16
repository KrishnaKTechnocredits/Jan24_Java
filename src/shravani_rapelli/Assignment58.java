package shravani_rapelli;

public class Assignment58 {
	
	int getCount(String str, char c) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch==c) {
				count++;
			}
		}
		return count;
	}
	
	void lastCharacterWithMinFreq(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			int getCount = getCount(str,ch);
			if(getCount == 1) {
				System.out.println(ch + " -> " + getCount);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment58 assign58 = new Assignment58();
		assign58.lastCharacterWithMinFreq("aakanksha");
	}

}
