package akshay_gaikwad;

public class UniqueChar2 {
	void getUniqueChar(String input) {
		for (int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		new UniqueChar2().getUniqueChar("technocredits");
	}
}
 