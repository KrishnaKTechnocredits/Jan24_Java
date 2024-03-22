//I__am___in_pune____
package akshay_gaikwad;

public class CountCharInBetWords {
	
	void printCharBetWord(String str) {
		int count = 0;
		String curr = "";
		for(int index = 0; index < str.length(); index++ ) {
			char ch = str.charAt(index);
			if(ch != '_') {
				curr += ch;
			}else {
				for(int i = index; i <str.length(); i++) {
					char currCh = str.charAt(i);
					if(currCh == '_') {
						count++;
						index++;
					}else {
						index--;
						break;
					}
				}
				System.out.println(curr + " -> " + count);
				count = 0;
				curr = "";
			}
		}
	}
	
	public static void main(String[] args) {
		new CountCharInBetWords().printCharBetWord("I__am___in_pune____");
	}
}
