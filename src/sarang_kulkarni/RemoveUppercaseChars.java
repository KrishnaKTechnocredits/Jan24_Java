/*Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String. 

input = "TechNoCREdits"
output : echodits

boolean Character.isUpperCase(char ch)*/

package sarang_kulkarni;

public class RemoveUppercaseChars {

	public void RemoveUppercaseChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		System.out.print(str);
	}

	public static void main(String[] args) {
		new RemoveUppercaseChars().RemoveUppercaseChar("TechNoCREdits");
	}
}
