/*Assignment - 47 : 4th Feb'2024
Return the string extracting all the digits from it. 

input :-Aas-H3v7i
output:-37

hint
if(!Character.isDigit(ch))
	str = str + ch;
	*/

package padmaja;

public class StringExtractingDigits {
	void stringExtractingDigits(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				output = output + ch;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		StringExtractingDigits stringExtractingDigits = new StringExtractingDigits();
		stringExtractingDigits.stringExtractingDigits("Aas-H3v7i");
	}
}
