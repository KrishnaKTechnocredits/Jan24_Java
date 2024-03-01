/*
 * Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */
package suresh.array;

public class Assignment55 {

	int getFreqOfChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	void getTagetChar(String str) {
		int maxcount = 0;
		char targetch = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			int count = getFreqOfChar(str, ch1);
			if (count == 2) {
				maxcount = count;
				targetch = ch1;
				System.out.println(targetch);
				System.out.println(maxcount);
				
			}
			

		}
		

	}

	public static void main(String[] args) {
		Assignment55 assignment55 = new Assignment55();
		assignment55.getTagetChar(" teecccchhhnno");
	}
}
