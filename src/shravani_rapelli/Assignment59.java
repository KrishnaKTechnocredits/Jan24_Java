/*
 * "Print the character with maximum frequency:
input: TeeCccChH
output: c->4"

 */

package shravani_rapelli;

public class Assignment59 {
	
	int getCharFreqCount(String str, char targetCh){
		int count = 0;
		for(int i=0;i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch==targetCh) {
				count++;
			}
		}
		return count;
	}
	
	void printCharWithMaxFreq(String str) {
		int max=0;
		char maxChar=' ';
		str = str.toLowerCase();
		for(int i=0;i<str.length(); i++) {
			char ch = str.charAt(i);
			int getCharFreqCount = getCharFreqCount(str,ch);
			if(getCharFreqCount > max) {
				max = getCharFreqCount;
				maxChar = ch;
			}
		}
		System.out.println(maxChar + "->" + max);
	}
	
	public static void main(String[] args) {
		Assignment59 assign59 = new Assignment59();
		assign59.printCharWithMaxFreq("TeeCccChH");
	}

}
