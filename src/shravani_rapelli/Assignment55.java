/*"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
*/

package shravani_rapelli;

public class Assignment55 {
	
	int getCharacterCount(String input, char str) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch==str) {
				count++;			}
		}
		return count;
	}
	
	void getCharacterOccursTwice(String input) {
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int getCharacterCount = getCharacterCount(input,ch);
			if(getCharacterCount == 2) {
				if(input.indexOf(ch) == i){
					System.out.print(ch);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment55 assign55 = new Assignment55();
		assign55.getCharacterOccursTwice("teecccchhhnno");
	}

}
