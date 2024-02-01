/*Remove all Uppercase character from given String. 

input = "TechNoCREdits"
output : echodits

boolean Character.isUpperCase(char ch)*/

package madhura_kulkarni;

public class Assignment27 {

	void removeuppercase(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flag = Character.isUpperCase(ch);
			if (flag == false) {
				System.out.print(ch);
			}
		}

	}

	public static void main(String[] args) {
		String str = "TechNoCREdits";
		Assignment27 ass = new Assignment27();
		ass.removeuppercase(str);
	}

}
