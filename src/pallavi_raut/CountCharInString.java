/*Assignment - 17 : 23th Jan'2024
1. Print the frequency of the given character from the given String.
Input : technocredits
Char: t
Output : frequency of t in technocredits is 2.
-----------------------------------------------------*/
package pallavi_raut;

public class CountCharInString {
	int count = 0;

	void printCountChar(char chr, String str) {
		for (int index = 0; index < str.length(); index++){
			if (str.charAt(index) == chr){
				count++;
			}
		}
		System.out.println("frequency of t in " + str +" is " + count);
	}

	public static void main(String[] args) {
		CountCharInString countChar = new CountCharInString();
		countChar.printCountChar('t', "technocredits");
	}
}