package akshada_marne;

public class RemoveUpperCaseChar {

	void remove(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) == true) {
				String temp = str.valueOf(ch);
				str = str.replace(temp, "*");
			}

		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String args[]) {
		RemoveUpperCaseChar removeUpperCaseChar = new RemoveUpperCaseChar();
		removeUpperCaseChar.remove("TechNoCREdits");
	}

}
