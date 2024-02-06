package varsha;

public class ArrayEx17 {

	void printString(String input) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isLowerCase(ch) && !Character.isUpperCase(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new ArrayEx17().printString("Aas-H3v7i");
	}
}
