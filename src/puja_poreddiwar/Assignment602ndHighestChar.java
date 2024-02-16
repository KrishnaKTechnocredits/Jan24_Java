/*
 Assignment - 60 : 14th Feb'2024
"Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */
package puja_poreddiwar;

public class Assignment602ndHighestChar {

	int getCharFrq(String str, char targetCh) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetCh) {
				count++;
				//System.out.println(count);
			}
		}
		return count;
	}

	char maxCharFrq(String input) {
		int max= 0;
		char targetCh = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = getCharFrq(input, ch);
			if(count > max) {
				max = count;
				targetCh = input.charAt(i);
			}
		}
		return targetCh;
	}

	
	void secondMaximum() {
		String  input1 = "aakanksha";
		 char targetCh = maxCharFrq(input1);
		 input1 = input1.replace(String.valueOf(targetCh), "");
		 
		 targetCh = maxCharFrq(input1);
		 input1 = input1.replace(String.valueOf(targetCh), "");
		 
		 System.out.println(targetCh);
	}
	
	public static void main(String[] args) {
		new Assignment602ndHighestChar().secondMaximum();
	}
}
