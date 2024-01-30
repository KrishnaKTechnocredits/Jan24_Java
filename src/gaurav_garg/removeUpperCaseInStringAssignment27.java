package gaurav_garg;

public class removeUpperCaseInStringAssignment27 {

	void removeUpperCaseInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);
			boolean value = Character.isUpperCase(char1);
			if (value == true) {
				str = str.replace(char1, '*');
			}
		}
		str = str.replace("*", "");
		System.out.print(str);
	}

	public static void main(String[] args) {
		new removeUpperCaseInStringAssignment27().removeUpperCaseInString("TechNoCREdits");
	}
}
