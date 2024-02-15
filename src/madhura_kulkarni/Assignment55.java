/*Assignment - 55 : 14th Feb'2024

"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"*/
package madhura_kulkarni;

public class Assignment55 {

	int getCharFreq(String str, char targetch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == targetch) {
				count++;
			}
		}
		return count;
	}

	void printCharOcurringTwice(String input) {
		System.out.print("Characters occuring twice in given string are: ");
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int charfreq = getCharFreq(input, ch);
			if (charfreq == 2) {
				if (i == input.indexOf(ch))
					System.out.print(input.charAt(i));
			}
		}
	}

	public static void main(String[] args) {

		String str = "teecccchhhnno";
		new Assignment55().printCharOcurringTwice(str);
	}

}
