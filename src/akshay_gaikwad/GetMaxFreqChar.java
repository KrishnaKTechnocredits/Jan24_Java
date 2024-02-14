/*Print the character with maximum frequency:
input: TeeCccChH
output: c->4*/

package akshay_gaikwad;

public class GetMaxFreqChar {
	
	int getFreqOfChar(String str, char ch) {
		int count = 0;
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			if (ch == currentChar) {
				count++;
			}
		}
		return count;
	}
	
	void printMaxFreqChar(String str) {
		int maxCount = 0;
		char maxFreqChar = ' ';
		int currentCount = 0;
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			if(str.indexOf(currentChar) == index) {
				currentCount = getFreqOfChar(str, currentChar);
				if (currentCount > maxCount) {
					maxCount = currentCount;
					maxFreqChar = currentChar;
				}
			}
		}
		System.out.println(maxFreqChar + " -> " + maxCount);
	}
	
	public static void main(String[] args) {
		new GetMaxFreqChar().printMaxFreqChar("TeeCccChH"); 
	}
}
