package ashwini_b;

/*
 Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String. 
input = "TechNoCREdits"
output : echodits
boolean Character.isUpperCase(char ch)
 */
public class RemoveUppercaseChar {

	void removeUpperChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				input = input.replace(ch, '*');
			}
		}
		//System.out.println(input);
		input = input.replace("*", "");
		System.out.println(input);

	}

	public static void main(String[] args) {
		RemoveUppercaseChar removeUppercaseChar = new RemoveUppercaseChar();
			removeUppercaseChar.removeUpperChar("TechNoCREdits");
	}
}
