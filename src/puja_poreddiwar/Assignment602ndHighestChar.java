/*
 Assignment - 60 : 14th Feb'2024
"Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */
package puja_poreddiwar;

public class Assignment602ndHighestChar {

	int maxCharFrq(String str, char targetCh) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetCh) {
				count++;
			}
		}
		return count;
	}

	char getCountChar(String input) {
		int max = 0;
		char targetCh = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = maxCharFrq(input, ch);
			if (count > max) {
				max = count;
				targetCh = input.charAt(i);
			}
		}
		return targetCh;
	}

	void secondMaximum(String input) {	
		char ch = getCountChar(input);
		String str = input.replace(String.valueOf(ch), "");
		ch = getCountChar(str);
		int count = maxCharFrq(str, ch);
		System.out.println("Second-highest maximum frequency character is = " + ch + " : " + count);
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		new Assignment602ndHighestChar().secondMaximum(input);
	}
}
