/*Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String. 

boolean Character.isUpperCase(char ch)*/

package prathamesh_tati;

public class UppercaseCharsElimination {

	void removeUppercaseChars(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true)
				str = str.replace(ch, '*');
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		UppercaseCharsElimination uppercaseCharsElimination = new UppercaseCharsElimination();
		uppercaseCharsElimination.removeUppercaseChars("TechNoCREdits");
	}
}