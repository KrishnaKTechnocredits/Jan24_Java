/*Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String. 

input = "TechNoCREdits"
output : echodits

boolean Character.isUpperCase(char ch)*/

package padmaja;

public class RemoveUpperCase {

	void removeUpperCase(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace(String.valueOf('*'), "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveUpperCase removeUpperCase = new RemoveUpperCase();
		removeUpperCase.removeUpperCase("TechNoCREdits");

	}
}
