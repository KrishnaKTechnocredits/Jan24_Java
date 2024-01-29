/*Assignment - 24 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [with indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis*/
package phenol_verma;

public class StrChrFrqIdxLstOf {
	void charCount(String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (str.indexOf(chr) == str.lastIndexOf(chr)) {
				System.out.print(str.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		StrChrFrqIdxLstOf strChrFrqIdxLstOf = new StrChrFrqIdxLstOf();
		strChrFrqIdxLstOf.charCount("technocredits");
	}
}
