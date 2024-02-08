/*Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String. 

input = "TechNoCREdits"
output : echodits

boolean Character.isUpperCase(char ch)*/

package phenol_verma;

public class RemoveUpperCaseChar {

	void remUperCaseChr(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveUpperCaseChar removeUpperCaseChar = new RemoveUpperCaseChar();
		removeUpperCaseChar.remUperCaseChr("TechNoCREdits");
	}
}
