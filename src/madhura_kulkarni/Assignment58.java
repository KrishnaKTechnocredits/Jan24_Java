/*Assignment - 58 : 14th Feb'2024
"Print last character with minimum frequency:
input: aakanksha
output: h->1"*/
package madhura_kulkarni;

public class Assignment58 {
	int getCharFreq(String str, char targetch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == targetch) {
				count++;
			}
		}
		return count;
	}

	void printLastCharWithMinFreq(String str) {
		int minimum = str.length();
		char targetch = ' ';
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			int count = getCharFreq(str, ch);
			if (minimum > count) {
				minimum = count;
				targetch = ch;
			}
		}
		System.out.println(targetch + "-->" + minimum);
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		new Assignment58().printLastCharWithMinFreq(input);
	}

}
